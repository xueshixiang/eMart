package com.emart.buyer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="seller")
public class Seller {

	@Id
	private int id;
	private String userName;
	private String password;
	private String companyName;
	private String gstin;
	private String emailId;
	private String mobileNumber;
	private String createdDatetime;
}
