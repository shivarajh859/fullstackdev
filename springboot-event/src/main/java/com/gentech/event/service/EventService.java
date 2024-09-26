package com.gentech.event.service;

import java.util.List;

import com.gentech.event.dto.EventDto;
 

public interface EventService {
	
	EventDto createEvent(EventDto eventDto);
	EventDto getById(Long id);
	List<EventDto> getAllEvents();
	EventDto updateEvent(Long id,EventDto eventDto);
	void deleteEvent(Long id);
	 
	List<EventDto> getByName(String name);
	List<EventDto> getByType(String type);
	List<EventDto> getByNameAndType(String name,String type);
	List<EventDto> getByPartialName(String name);
	
	List<EventDto> getEvents( int pageNumber,int pageSize);

	List<EventDto> getEvents( int pageNumber,int pageSize, String columnName);
}
