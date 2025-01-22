package com.blooddonormanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserException extends RuntimeException {
	
	private String exceptionMessage;
	
}
