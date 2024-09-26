package com.gentech.catering.entity;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_catering")
public class Catering {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="catering_id")
	private Long id;

	@Column(name="catering_name")
	private String cateringName;

	@Column(name="catering_type")
	private String cateringType;

	@Column(name="catering_desc")
	private String cateringDesc;
	
	@Column(name="catering_loc")
	private String cateringLocation;

	@CreationTimestamp
	@Column(name="created_at")
	private Date createdAt;

	public Catering() {}	
	
 
	public Catering(Long id, String cateringName, String cateringType, String cateringDesc, Date createdAt,
			String cateringLocation) {
		super();
		this.id = id;
		this.cateringName = cateringName;
		this.cateringType = cateringType;
		this.cateringDesc = cateringDesc;
		this.cateringLocation = cateringLocation;
		this.createdAt = createdAt;
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

	public String getCateringLocation() {
		return cateringLocation;
	}

	public Date getCreatedAt() {
		return createdAt;
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

	public void setCateringLocation(String cateringLocation) {
		this.cateringLocation = cateringLocation;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	} 
}
