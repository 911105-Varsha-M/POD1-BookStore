package com.POD1.OnlineBookStore.dto;

import lombok.Data;

@Data
public class UserDto {
	private String name;
	private String email;
	private String password;
	private Long mobileNumber;
	private String role;

}
