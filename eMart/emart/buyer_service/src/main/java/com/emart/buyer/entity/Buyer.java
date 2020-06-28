package com.emart.buyer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="buyer")
public class Buyer {

	@Id
	private int id;
	private String userName;
	private String password;
	private String emailId;
	private String mobileNumber;
	private String createdDatetime;
}
