package com.gentech.event.mapper;

import com.gentech.event.dto.EventDto;
import com.gentech.event.entity.Event;

public class EventMapper {
	public static Event mapToEvent(EventDto eventDto)
	{
		Event event=new Event(   

				eventDto.getId(),
				eventDto.getEventName(),
				eventDto.getEventType(),
				eventDto.getEventDesc(),
				eventDto.getCreatedAt(),
				eventDto.getUpdatedAt()
				);

		return event;
	}

	public static EventDto mapToEventDto(Event event)
	{
		EventDto eventDto=new EventDto(
				event.getId(),
				event.getEventName(),
				event.getEventType(),
				event.getEventDesc(),
				event.getCreatedAt(),
				event.getUpdatedAt()
				);
		return eventDto ;

	}
}
