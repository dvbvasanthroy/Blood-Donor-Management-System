package com.blooddonormanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.blooddonormanagementsystem.dao.UserDao;
import com.blooddonormanagementsystem.entity.DonorDetails;
import com.blooddonormanagementsystem.entity.UserDetails;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	BloodDonorController bloodDonorController;
	
	@Autowired
	DonorController donorController;
	
	@Autowired
	UserDao userDao;
	
	@PostMapping("/registration")
	public String registration(UserDetails userDetails, String donationstatus, String bloodgroup, String healthcondition) {
		if (userDetails != null) {
			UserDetails registeredUserDetails = userDao.userRegistration(userDetails);
			if (registeredUserDetails != null&&donationstatus.equalsIgnoreCase("yes")) {
				if (bloodgroup!=null&&bloodgroup!=""&&healthcondition!=null&&healthcondition!="") {
					DonorDetails registeredDonor = donorController.registerDonor(userDetails, bloodgroup, healthcondition);
				}
			}
			return bloodDonorController.loginPage();
		}
		return bloodDonorController.registrationPage();
	}
	
	@GetMapping("/login")
	public String login(String emailId, String password, HttpServletRequest request) {
		if (emailId != null&&emailId!=""&&password!=null&&password!="") {
			UserDetails loggedUserDetails = userDao.userLogin(emailId, password);			
			boolean loginStatus=(loggedUserDetails!=null);
//			System.out.println(loginStatus);
			HttpSession session=request.getSession();
			session.setAttribute("loginstatus", loginStatus);
			return bloodDonorController.homePage();
		}
		return bloodDonorController.loginPage();
	}

}
