package com.blooddonormanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blooddonormanagementsystem.entity.DonorDetails;
import java.util.List;


public interface DonorRepository extends JpaRepository<DonorDetails, Integer> {
	
	List<DonorDetails> findByBloodgroupAndAreaAndCityAndState(String bloodgroup, String area, String city, String state);
}
