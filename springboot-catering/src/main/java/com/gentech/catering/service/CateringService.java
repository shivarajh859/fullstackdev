package com.gentech.catering.service;

import java.util.List;

import com.gentech.catering.dto.CateringDto;

public interface CateringService {

	CateringDto createCatering(CateringDto cateringDto);
	
	List<CateringDto> getAllCaterings();
	
	CateringDto getCateringById(Long id);
	
	CateringDto updateCatering(Long id,CateringDto cateringDto);
	
	void deleteCateringsById(Long id);
	
	List<CateringDto> getByCateringNames(String name);

	List<CateringDto> getByCateringLocation(String loc);
	
	List<CateringDto> getByCateringNamesAndLoc(String name, String loc);
	
	List<CateringDto> getAllCaterings(int pageNumber,int pageSize);
	
	List<CateringDto> getAllCaterings(int pageNumber,int pageSize,String columnName);
		
}
