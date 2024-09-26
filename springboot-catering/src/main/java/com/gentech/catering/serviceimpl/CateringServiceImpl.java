package com.gentech.catering.serviceimpl;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.gentech.catering.dto.CateringDto;
import com.gentech.catering.entity.Catering;
import com.gentech.catering.mapper.CateringMapper;
import com.gentech.catering.repository.CateringRepository;
import com.gentech.catering.service.CateringService;

@Service
public class CateringServiceImpl implements CateringService{

	@Autowired
	private CateringRepository catRepository;

	@Override
	public CateringDto createCatering(CateringDto cateringDto) {
		Catering catering=CateringMapper.mapToCatering(cateringDto);
		Catering saveCatering=catRepository.save(catering);
		return  CateringMapper.mapToCateringDto(saveCatering);
	}

	@Override
	public List<CateringDto> getAllCaterings() {

		return  catRepository.findAll()
				.stream().map((catering) -> CateringMapper.mapToCateringDto(catering))
				.collect(Collectors.toList());
	}

	@Override
	public CateringDto getCateringById(Long id) {
		Catering catering=catRepository.findById(id).orElseThrow(() ->
		new RuntimeException("The Catering Id is "+id+" is not found in the database"));
		return  CateringMapper.mapToCateringDto(catering);
	}

	@Override
	public CateringDto updateCatering(Long id, CateringDto cateringDto) {
		Catering existingCatering=catRepository.findById(id).orElseThrow(() ->
		new RuntimeException("The Catering Id is "+id+" is not found in the database"));	
		existingCatering.setId(id);
		existingCatering.setCateringName(cateringDto.getCateringName());
		existingCatering.setCateringType(cateringDto.getCateringType());
		existingCatering.setCateringDesc(cateringDto.getCateringDesc());
		existingCatering.setCreatedAt(cateringDto.getCreatedAt());
		existingCatering.setCateringLocation(cateringDto.getCateringLocation());
		Catering saveCatering=catRepository.save(existingCatering);
		return  CateringMapper.mapToCateringDto(saveCatering);
	}

	@Override
	public void deleteCateringsById(Long id) {
		catRepository.findById(id).orElseThrow(() ->
		new RuntimeException("The Event Id "+id+" is not found in table"));
		catRepository.deleteById(id);

	}

	@Override
	public List<CateringDto> getByCateringNames(String name) {
		 
		return  catRepository.findByCateringNameContaining(name)
				.stream().map((catering) -> CateringMapper.mapToCateringDto(catering))
				.collect(Collectors.toList());
	}

	@Override
	public List<CateringDto> getByCateringLocation(String loc) {
		return  catRepository.findByCateringLocation(loc)
				.stream().map((catering) -> CateringMapper.mapToCateringDto(catering))
				.collect(Collectors.toList());
	}
	@Override
	public List<CateringDto> getByCateringNamesAndLoc(String name, String loc) {
		return  catRepository.findByCateringNameAndCateringLocation(name, loc)
				.stream().map((catering) -> CateringMapper.mapToCateringDto(catering))
				.collect(Collectors.toList());
	}

	@Override
	public List<CateringDto> getAllCaterings(int pageNumber, int pageSize) {
		Pageable pages = PageRequest.of(pageNumber, pageSize);
		return  catRepository.findAll(pages).getContent()
				.stream().map((catering) -> CateringMapper.mapToCateringDto(catering))
				.collect(Collectors.toList());
	}

	@Override
	public List<CateringDto> getAllCaterings(int pageNumber, int pageSize, String columnName) {
		Sort sort=Sort.by(Direction.ASC, columnName);
		Pageable pages = PageRequest.of(pageNumber, pageSize ,sort);
		return  catRepository.findAll(pages).getContent()
				.stream().map((catering) -> CateringMapper.mapToCateringDto(catering))
				.collect(Collectors.toList());
	}

}
