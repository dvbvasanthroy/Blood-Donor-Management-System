package com.blooddonormanagementsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class DonorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Donor_Id")
	private Integer id;
	@Column(name = "Donor_FirstName",length = 45,nullable = false)
	private String firstname;
	@Column(name = "Donor_LastName",length = 45,nullable = false)
	private String lastname;
	@Column(name = "Donor_Gender",length = 7,nullable = false)
	private String gender;
	@Column(name = "Donor_MobileNumber",length = 10,nullable = false,unique = true)
	private String mobilenumber;
	@Column(name = "Donor_EmailId",length = 45,nullable = false,unique = true)
	private String emailid;
	@Column(name = "Donor_Blood_Group",length = 4,nullable = false)
	private String bloodgroup;
	@Column(name = "Donor_Health_Condition",length = 25)
	private String healthcondition;
	@Column(name = "Donor_Area",length = 45)
	private String area;
	@Column(name = "Donor_City",length = 45)
	private String city;
	@Column(name = "Donor_State",length = 45)
	private String state;
	@Column(name = "Donor_Pincode",length = 6)
	private String pincode;
}
