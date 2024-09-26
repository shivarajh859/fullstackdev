package com.gentech.event.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventDto  {
	private Long id;
	private String eventName;
	private String eventType;
	private String eventDesc;
	private Date createdAt;
	private Date updatedAt;
	
	public EventDto() {}

	public EventDto(Long id, String eventName, String eventType, String eventDesc, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.eventType = eventType;
		this.eventDesc = eventDesc;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public String getEventName() {
		return eventName;
	}

	public String getEventType() {
		return eventType;
	}

	public String getEventDesc() {
		
		
		return eventDesc;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
		 
}
