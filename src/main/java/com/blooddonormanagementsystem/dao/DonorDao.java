package com.blooddonormanagementsystem.dao;

import java.util.List;

import com.blooddonormanagementsystem.entity.DonorDetails;
import com.blooddonormanagementsystem.entity.UserDetails;

public interface DonorDao {
	DonorDetails registerDonor(UserDetails userDetails, String bloodgroup, String healthcondition);
	List<DonorDetails> searchForDonors(String bloodgroup, String area, String city, String state);
}
