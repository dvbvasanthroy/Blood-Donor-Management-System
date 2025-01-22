package com.blooddonormanagementsystem.dao;

import com.blooddonormanagementsystem.entity.UserDetails;

public interface UserDao {
	UserDetails userLogin(String emailId, String password);
	UserDetails userRegistration(UserDetails userDetails);
}
