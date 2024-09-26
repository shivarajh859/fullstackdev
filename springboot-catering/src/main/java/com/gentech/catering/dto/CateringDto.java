package com.gentech.catering.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CateringDto {

	private Long id;
	private String cateringName;
	private String cateringType;
	private String cateringDesc;
	private Date createdAt;
	private String cateringLocation;

	public CateringDto() {}

	public CateringDto(Long id, String cateringName, String cateringType, String cateringDesc, Date createdAt,
			String cateringLocation) {
		super();
		this.id = id;
		this.cateringName = cateringName;
		this.cateringType = cateringType;
		this.cateringDesc = cateringDesc;
		this.createdAt = createdAt;
		this.cateringLocation = cateringLocation;
	}

	public Long getId() {
		return id;
	}

	public String getCateringName() {
		return cateringName;
	}

	public String getCateringType() {
		return cateringType;
	}


	public String getCateringDesc() {
		return cateringDesc;
	}


	public Date getCreatedAt() {
		return createdAt;
	}

	public String getCateringLocation() {
		return cateringLocation;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCateringName(String cateringName) {
		this.cateringName = cateringName;
	}

	public void setCateringType(String cateringType) {
		this.cateringType = cateringType;
	}

	public void setCateringDesc(String cateringDesc) {
		this.cateringDesc = cateringDesc;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setCateringLocation(String cateringLocation) {
		this.cateringLocation = cateringLocation;
	}


}
