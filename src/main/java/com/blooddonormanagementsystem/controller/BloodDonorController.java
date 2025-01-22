package com.blooddonormanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class BloodDonorController {
	
	@GetMapping("/loginPage")
	public String loginPage() {
		return "Login";
	}

	@GetMapping("/registrationPage")
	public String registrationPage() {
		return "Registration";
	}
	
	@GetMapping("/homePage")
	public String homePage() {
//		System.out.println("homePage()");
		return "Home";
	}
	
	@GetMapping("/")
	public String homePage(HttpServletRequest request) {
//		System.out.println("homePage(request)");
		HttpSession session=request.getSession();
		session.setAttribute("loginstatus", false);
		return "Home";
	}

	@GetMapping("/needBloodPage")
	public String needBloodPage() {
		return "NeedBlood";
	}

	@GetMapping("/donateBloodPage")
	public String donateBloodPage() {
		return "DonateBlood";
	}
	
	@GetMapping("/donorsListPage")
	public String donorsListPage() {
		return "DonorsList";
	}
	
	@GetMapping("/hospitalRegistrationPage")
	public String hospitalRegistrationPage() {
		return "HospitalRegistration";
	}
	
	@GetMapping("/hospitalsListPage")
	public String hospitalsListPage() {
		return "HospitalsList";
	}
}
