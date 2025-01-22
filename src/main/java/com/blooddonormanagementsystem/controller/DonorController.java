package com.blooddonormanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.blooddonormanagementsystem.dao.DonorDao;
import com.blooddonormanagementsystem.entity.DonorDetails;
import com.blooddonormanagementsystem.entity.UserDetails;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class DonorController {
	
	@Autowired
	BloodDonorController bloodDonorController;
	
	@Autowired
	DonorDao donorDao;
	
	public DonorDetails registerDonor(UserDetails userDetails, String bloodgroup, String healthcondition) {
		return donorDao.registerDonor(userDetails, bloodgroup, healthcondition);
	}
	
	@GetMapping("/searchDonors")
	public String searchDonors(String bloodgroup, String area, String city, String state, HttpServletRequest request, Model model) {
		HttpSession session=request.getSession();
		boolean loginStatus=(boolean) session.getAttribute("loginstatus");
		System.out.println(loginStatus);
		if (loginStatus==true) {
			List<DonorDetails> listOfDonors = donorDao.searchForDonors(bloodgroup, area, city, state);
			if (listOfDonors != null&&listOfDonors.size()>0) {
				model.addAttribute("donordetails", listOfDonors);			
				return bloodDonorController.donorsListPage();			
			}
			return bloodDonorController.homePage();
		}
		return bloodDonorController.loginPage();
	}
}
