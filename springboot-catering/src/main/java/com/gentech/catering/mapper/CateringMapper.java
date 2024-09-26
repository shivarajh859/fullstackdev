package com.gentech.catering.mapper;

import com.gentech.catering.dto.CateringDto;
import com.gentech.catering.entity.Catering;

public class CateringMapper {

	public static Catering mapToCatering(CateringDto cateringDto)
	{

		Catering catering=new Catering(

				cateringDto.getId(),
				cateringDto.getCateringName(),
				cateringDto.getCateringType(),
				cateringDto.getCateringDesc(),
				cateringDto.getCreatedAt(),
				cateringDto.getCateringLocation()
				);
		return catering;
	}

	public static CateringDto mapToCateringDto(Catering catering) 
	{
		CateringDto cateringDto=new CateringDto(

				catering.getId(),
				catering.getCateringName(),
				catering.getCateringType(),
				catering.getCateringDesc(),
				catering.getCreatedAt(),
				catering.getCateringLocation()
				);
		return cateringDto;
	}


}
