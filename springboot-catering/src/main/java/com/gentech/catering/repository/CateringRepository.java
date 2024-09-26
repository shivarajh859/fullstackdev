package com.gentech.catering.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.gentech.catering.entity.Catering;

public interface CateringRepository extends JpaRepository<Catering, Long>,
PagingAndSortingRepository<Catering, Long>{

	List<Catering> findByCateringNameContaining(String name);

	List<Catering> findByCateringLocation(String loc);

	List<Catering> findByCateringNameAndCateringLocation(String name, String loc);

}
