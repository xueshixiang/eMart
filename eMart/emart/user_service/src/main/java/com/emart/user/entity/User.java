package com.emart.user.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class User {

	private String userType;
	private String userName;
	private String password;
	private String emailId;
	private String mobileNumber;
	private String createdDatetime;
}
