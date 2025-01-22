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
public class HospitalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Hospital_Id")
	private Integer hospitalid;
	@Column(name = "Hospital_Name",length = 45,nullable = false)
	private String hospitalname;
	@Column(name = "Hospital_MobileNumber",length = 10,nullable = false,unique = true)
	private String mobilenumber;
	@Column(name = "Hospital_EmailId",length = 45,nullable = false,unique = true)
	private String emailid;
	@Column(name = "Hospital_Area",length = 45)
	private String area;
	@Column(name = "Hospital_City",length = 45)
	private String city;
	@Column(name = "Hospital_State",length = 45)
	private String state;
	@Column(name = "Hospital_Pincode",length = 6)
	private String pincode;
}
