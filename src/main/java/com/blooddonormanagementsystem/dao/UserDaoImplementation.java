package com.blooddonormanagementsystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blooddonormanagementsystem.entity.UserDetails;
import com.blooddonormanagementsystem.exception.UserException;
import com.blooddonormanagementsystem.repository.UserRepository;

@Component
public class UserDaoImplementation implements UserDao {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails userLogin(String emailId, String password) {
		UserDetails byEmailid = userRepository.getByEmailid(emailId);
		if (byEmailid!=null&&byEmailid.getEmailid().equals(emailId)) {
			if (byEmailid.getPassword().equals(password)) {
				return byEmailid;
			} else {
				throw new UserException("Invalid Password");
			}
		} else {
			throw new UserException("Invalid Email Id");
		}
	}

	@Override
	public UserDetails userRegistration(UserDetails userDetails) {
		return userRepository.save(userDetails);
	}

}
