package com.blooddonormanagementsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blooddonormanagementsystem.entity.DonorDetails;
import com.blooddonormanagementsystem.entity.UserDetails;
import com.blooddonormanagementsystem.repository.DonorRepository;

@Component
public class DonorDaoImplementation implements DonorDao {
	
	@Autowired
	DonorRepository donorRepository;
	
	@Override
	public List<DonorDetails> searchForDonors(String bloodgroup, String area, String city, String state) {
		return donorRepository.findByBloodgroupAndAreaAndCityAndState(bloodgroup, area, city, state);
	}

	@Override
	public DonorDetails registerDonor(UserDetails userDetails, String bloodgroup, String healthcondition) {
		DonorDetails donorDetails=new DonorDetails();
		donorDetails.setFirstname(userDetails.getFirstname());
		donorDetails.setLastname(userDetails.getLastname());
		donorDetails.setGender(userDetails.getGender());
		donorDetails.setMobilenumber(userDetails.getMobilenumber());
		donorDetails.setEmailid(userDetails.getEmailid());
		donorDetails.setBloodgroup(bloodgroup);
		donorDetails.setHealthcondition(healthcondition);
		donorDetails.setArea(userDetails.getArea());
		donorDetails.setCity(userDetails.getCity());
		donorDetails.setState(userDetails.getState());
		return donorRepository.save(donorDetails);
	}
	
	
}
