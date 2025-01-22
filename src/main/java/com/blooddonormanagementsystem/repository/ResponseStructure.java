package com.blooddonormanagementsystem.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseStructure<T> {
	
	T data;
	String message;
	int httpStatusCode;
}
