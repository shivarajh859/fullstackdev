package com.gentech.event.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.gentech.event.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> , PagingAndSortingRepository<Event, Long>{

	List<Event> findByEventName(String name);
	List<Event> findByEventType(String type);
	List<Event> findByEventNameAndEventType(String name, String type);
	List<Event> findByEventNameContaining(String partial);	 

}
