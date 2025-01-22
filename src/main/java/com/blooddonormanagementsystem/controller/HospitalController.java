package com.blooddonormanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.blooddonormanagementsystem.dao.HospitalDao;
import com.blooddonormanagementsystem.entity.HospitalDetails;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class HospitalController {
	
	@Autowired
	BloodDonorController bloodDonorController;
	
	@Autowired
	HospitalDao hospitalDao;
	
	@PostMapping("/hospitalRegistration")
	public String hospitalRegistration(HospitalDetails hospitalDetails, Model model) {
		HospitalDetails registeredHospitalDetails = hospitalDao.hospitalRegistration(hospitalDetails);
		if (registeredHospitalDetails != null) {
			model.addAttribute("message", "Registration Done");
			return bloodDonorController.homePage();
		}
		model.addAttribute("message", "Invaid Details");
		return bloodDonorController.hospitalRegistrationPage();
	}
	
	@GetMapping("/searchHospitals")
	public String searchHospitals(String area, String city, String state,HttpServletRequest request, Model model) {
		HttpSession session=request.getSession();
		boolean loginStatus=(boolean) session.getAttribute("loginstatus");
		if (loginStatus==true) {
			List<HospitalDetails> listOfHospitals = hospitalDao.searchForHospitals(area, city, state);
			if (listOfHospitals != null&&listOfHospitals.size()>0) {
				model.addAttribute("hospitaldetails", listOfHospitals);
				return bloodDonorController.hospitalsListPage();
			}			
		}
		return bloodDonorController.loginPage();
	}
	
}
