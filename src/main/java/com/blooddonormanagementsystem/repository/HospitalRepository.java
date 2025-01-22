package com.blooddonormanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blooddonormanagementsystem.entity.HospitalDetails;
import java.util.List;


public interface HospitalRepository extends JpaRepository<HospitalDetails, Integer> {
	
	List<HospitalDetails> findByAreaAndCityAndState(String area, String city, String state);
}
