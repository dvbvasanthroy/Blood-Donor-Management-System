package com.blooddonormanagementsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Id")
	private Integer id;
	@Column(name = "User_FirstName",length = 45,nullable = false)
	private String firstname;
	@Column(name = "User_LastName",length = 45,nullable = false)
	private String lastname;
	@Column(name = "User_Gender",length = 7,nullable = false)
	private String gender;
	@Column(name = "User_MobileNumber",length = 10,nullable = false,unique = true)
	private String mobilenumber;
	@Column(name = "User_EmailId",length = 45,nullable = false,unique = true)
	private String emailid;
	@Column(name = "User_Password",length = 12,nullable = false)
	private String password;
	@Column(name = "User_Area",length = 45)
	private String area;
	@Column(name = "User_City",length = 45)
	private String city;
	@Column(name = "User_State",length = 45)
	private String state;
	@Column(name = "User_Pincode",length = 6)
	private String pincode;
}
