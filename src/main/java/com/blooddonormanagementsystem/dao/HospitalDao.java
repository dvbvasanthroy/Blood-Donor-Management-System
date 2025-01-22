package com.blooddonormanagementsystem.dao;

import java.util.List;

import com.blooddonormanagementsystem.entity.HospitalDetails;

public interface HospitalDao {
	void hospitalLogin(String emailid, String password);
	HospitalDetails hospitalRegistration(HospitalDetails hospitalDetails);
	List<HospitalDetails> searchForHospitals(String area, String city, String state);
}
