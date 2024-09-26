package com.gentech.event.contoller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.event.dto.EventDto;
import com.gentech.event.service.EventService;

@RestController
@RequestMapping("/v1/api")
public class EventController {

	@Autowired
	private EventService eventService;
	@PostMapping("event")  
	public ResponseEntity<EventDto> createEvent(@RequestBody EventDto eventDto)
	{
		return new ResponseEntity<EventDto>(eventService.createEvent(eventDto),HttpStatusCode.valueOf(201));

	}

	@GetMapping("event/{id}") 
	public ResponseEntity<EventDto> getEventById( @PathVariable Long id)
	{
		return new ResponseEntity<EventDto>(eventService.getById(id),HttpStatusCode.valueOf(201));

	}

	@GetMapping("events")
	public ResponseEntity<List<EventDto>> getAllEvents()
	{
		return new ResponseEntity<List<EventDto>>(eventService.getAllEvents(),HttpStatusCode.valueOf(200));
	}

	@PutMapping("event/{id}")
	public ResponseEntity<EventDto> updateEvents(@PathVariable Long id,@RequestBody EventDto eventDto)
	{
		return new ResponseEntity<EventDto>(eventService.updateEvent(id,eventDto),HttpStatusCode.valueOf(200));
	}

	@DeleteMapping("event/{id}") 
	public ResponseEntity<String> deleteEvent(@PathVariable Long id)
	{
		eventService.deleteEvent(id);
		return new ResponseEntity<String>("event is "+id+ " is deleted",HttpStatusCode.valueOf(200));

	}
	@GetMapping("event/filterbyname")
	public ResponseEntity<List<EventDto>> getEventByName(@RequestParam String name)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getByName(name),HttpStatusCode.valueOf(200));
	}
	@GetMapping("event/filterbytype")
	public ResponseEntity<List<EventDto>> getEventByType(@RequestParam String type)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getByType(type),HttpStatusCode.valueOf(200));
	}
	@GetMapping("event/filterbynameandtype")
	public ResponseEntity<List<EventDto>> getEventByNameAndType(@RequestParam String name ,String type)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getByNameAndType(name,type),HttpStatusCode.valueOf(200));
	}
	@GetMapping("event/filterbypartialname")
	public ResponseEntity<List<EventDto>> getEventByPartialName(@RequestParam String name)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getByPartialName(name),HttpStatusCode.valueOf(200));
	}
	// http://localhost:8089/v1/api/event/pagination?pageNumber=0&pageSize=4
	@GetMapping("/event/pagination")
	public ResponseEntity<List<EventDto>> getAllCustomersByPagination(@RequestParam int pageNumber, 
			@RequestParam int pageSize)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getEvents(pageNumber,pageSize), HttpStatus.OK);
	}

	//http://localhost:8089/v1/api/event/pageandsort?pageNumber=1&pageSize=3&columnName=id
	@GetMapping("/event/pageandsort")
	public ResponseEntity<List<EventDto>> getAllCustomersByPaginationAndSort(@RequestParam int pageNumber, 
			@RequestParam int pageSize,@RequestParam String columnName)
	{

		return new ResponseEntity<List<EventDto>>(eventService.getEvents(pageNumber, pageSize, columnName), HttpStatus.OK);
	}

}
