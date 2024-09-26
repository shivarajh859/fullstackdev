package com.gentech.catering.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.catering.dto.CateringDto;
 
import com.gentech.catering.service.CateringService;
 

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
 

@RestController
@RequestMapping("v1/api")
public class CateringController {
	
	@Autowired
	private CateringService cateringtService;
	// http://localhost:9090/v1/api/catering
	@PostMapping("catering")
	public ResponseEntity<CateringDto> createCatering(@RequestBody CateringDto cateringDto)
	{
		return  new ResponseEntity<CateringDto> (cateringtService.createCatering(cateringDto),HttpStatusCode.valueOf(200));
	 
	}
	@GetMapping("catering/{id}")
	public ResponseEntity<CateringDto> getCateringById( @PathVariable Long id)
	{
		return  new ResponseEntity<CateringDto> (cateringtService.getCateringById(id),HttpStatusCode.valueOf(200));
	}
	@GetMapping("/caterings")
	public ResponseEntity<List<CateringDto>> getAllCaterings()
	{
		return new ResponseEntity<List<CateringDto>>(cateringtService.getAllCaterings(), HttpStatusCode.valueOf(200));
	}
	@PutMapping("/catering/{id}")
	public ResponseEntity<CateringDto> modifySpecificCatering(@PathVariable Long id, @RequestBody CateringDto cateringDto)
	{
		return new ResponseEntity<CateringDto>(cateringtService.updateCatering(id, cateringDto), HttpStatusCode.valueOf(200));
	}
	
	@DeleteMapping("/catering/{id}")
	public ResponseEntity<String> deleteSpecificCatering(@PathVariable Long id)
	{
		cateringtService.deleteCateringsById(id);
		return new ResponseEntity<String>("The Catering id "+id+" has deleted from the database table successfully",HttpStatusCode.valueOf(200));
	}
	// http://localhost:9090/v1/api//catering/filterbyname?name=Elegant Affairs
	@GetMapping("/catering/filterbyname")
	public ResponseEntity<List<CateringDto>> getByName(@RequestParam String name)
	{
		return new ResponseEntity<List<CateringDto>>(cateringtService.getByCateringNames(name),HttpStatusCode.valueOf(200));
		
	}
	// http://localhost:9090/v1/api/catering/filterbyloc?loc=Bangalore
	@GetMapping("/catering/filterbyloc")
	public ResponseEntity<List<CateringDto>> getByLocation(@RequestParam String loc)
	{
		return new ResponseEntity<List<CateringDto>>(cateringtService.getByCateringLocation(loc),HttpStatusCode.valueOf(200));
		
	} 
	// http://localhost:9090/v1/api/catering/filterbynameandloc?name=sjs%20catering&loc=mysore
	@GetMapping("/catering/filterbynameandloc")
	public ResponseEntity<List<CateringDto>> getByNameAndLoaction( String name , String loc)
	{
		return new ResponseEntity<List<CateringDto>>(cateringtService.getByCateringNamesAndLoc(name ,loc),HttpStatusCode.valueOf(200));
		
	}
	// http://localhost:9090/v1/api/catering/pagination?pageNumber=0&pageSize=4
		@GetMapping("/catering/pagination")
		public ResponseEntity<List<CateringDto>> getAllCustomersByPagination(@RequestParam int pageNumber, 
				@RequestParam int pageSize)
		{
			return new ResponseEntity<List<CateringDto>>(cateringtService.getAllCaterings(pageNumber,pageSize), HttpStatus.OK);
		}

		//http://localhost:9090/v1/api/catering/pageandsort?pageNumber=1&pageSize=3&columnName=id
		@GetMapping("/catering/pageandsort")
		public ResponseEntity<List<CateringDto>> getAllCustomersByPaginationAndSort(@RequestParam int pageNumber, 
				@RequestParam int pageSize,@RequestParam String columnName)
		{

			return new ResponseEntity<List<CateringDto>>(cateringtService.getAllCaterings(pageNumber, pageSize, columnName), HttpStatus.OK);
		}

}
