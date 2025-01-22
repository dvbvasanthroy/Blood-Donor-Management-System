package com.blooddonormanagementsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blooddonormanagementsystem.entity.HospitalDetails;
import com.blooddonormanagementsystem.repository.HospitalRepository;

@Component
public class HospitalDaoImplementation implements HospitalDao{
	
	@Autowired
	HospitalRepository hospitalRepository;
	
	@Override
	public void hospitalLogin(String emailid, String password) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public HospitalDetails hospitalRegistration(HospitalDetails hospitalDetails) {
		return hospitalRepository.save(hospitalDetails);
	}



	@Override
	public List<HospitalDetails> searchForHospitals(String area, String city, String state) {
		return hospitalRepository.findByAreaAndCityAndState(area, city, state);
	}
	
	
}
