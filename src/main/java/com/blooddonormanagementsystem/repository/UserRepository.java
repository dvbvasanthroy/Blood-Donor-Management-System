package com.blooddonormanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blooddonormanagementsystem.entity.UserDetails;


public interface UserRepository extends JpaRepository<UserDetails, Integer> {
	
	UserDetails getByEmailid(String emailid);
}
