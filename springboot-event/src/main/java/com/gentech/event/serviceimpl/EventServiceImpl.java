package com.gentech.event.serviceimpl;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.gentech.event.dto.EventDto;
import com.gentech.event.entity.Event;
import com.gentech.event.mapper.EventMapper;
import com.gentech.event.repository.EventRepository;
import com.gentech.event.service.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository eventRepository;

	@Override
	public EventDto createEvent(EventDto eventDto) {
		Event event=EventMapper.mapToEvent(eventDto);
		Event saveEvent= eventRepository.save(event);
		return  EventMapper.mapToEventDto(saveEvent);
	}

	@Override
	public EventDto getById(Long id) {
		Event event=eventRepository.findById(id).orElseThrow(() ->
		new RuntimeException("The Event Id "+id+" is not found" ));
		return  EventMapper.mapToEventDto(event);
	}

	@Override
	public List<EventDto> getAllEvents() {

		return eventRepository.findAll()
				.stream().map((event) -> EventMapper.mapToEventDto(event))
				.collect(Collectors.toList());
	}

	@Override
	public EventDto updateEvent(Long id, EventDto eventDto) {
		Event exisitingEvent=eventRepository.findById(id).orElseThrow(() ->
		new RuntimeException("The Event Id "+id+" is not found in table"));
		exisitingEvent.setId(id);
		exisitingEvent.setEventName(eventDto.getEventName());
		exisitingEvent.setEventType(eventDto.getEventType());
		exisitingEvent.setEventDesc(eventDto.getEventDesc());
		exisitingEvent.setUpdatedAt(eventDto.getUpdatedAt());
		Event saveEvent=eventRepository.save(exisitingEvent);
		return  EventMapper.mapToEventDto(saveEvent) ;
	}

	@Override
	public void deleteEvent(Long id) {
		eventRepository.findById(id).orElseThrow(() ->
		new RuntimeException("The Event Id "+id+" is not found in table"));
		eventRepository.deleteById(id);

	}

	@Override
	public List<EventDto> getByName(String name) {

		return  eventRepository.findByEventName(name)
				.stream().map((event) -> EventMapper.mapToEventDto(event))
				.collect(Collectors.toList());
	}


	@Override
	public List<EventDto> getByType(String type) {
		return  eventRepository.findByEventType(type)
				.stream().map((event) -> EventMapper.mapToEventDto(event))
				.collect(Collectors.toList());
	}

	@Override
	public List<EventDto> getByNameAndType(String name, String type) {
		return  eventRepository.findByEventNameAndEventType(name, type)
				.stream().map((event) -> EventMapper.mapToEventDto(event))
				.collect(Collectors.toList());
	}

	@Override
	public List<EventDto> getByPartialName(String partial) {
		return eventRepository.findByEventNameContaining(partial)
				.stream().map((event) -> EventMapper.mapToEventDto(event))
				.collect(Collectors.toList());
	}

	@Override
	public List<EventDto> getEvents(int pageNumber, int pageSize) {
		Pageable pages = PageRequest.of(pageNumber, pageSize);
		return eventRepository.findAll(pages).getContent()
				.stream().map((event) -> EventMapper.mapToEventDto(event))
				.collect(Collectors.toList());
	}

	@Override
	public List<EventDto> getEvents(int pageNumber, int pageSize, String columnName) {
		Sort sort=Sort.by(Direction.ASC, columnName);
		Pageable pages = PageRequest.of(pageNumber, pageSize, sort);
		return eventRepository.findAll(pages).getContent()
				.stream().map((event) -> EventMapper.mapToEventDto(event))
				.collect(Collectors.toList());
	}
}
