/**
 * 
 */
package com.emart.buyer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author HongPengWen
 *
 */
@Data
@Entity
@Table(name="transactions")
public class Transactions {
	
	@Id
	private int id;
	private int userId;
	private int sellerId;
	private String transactionType;
	private String dateTime;
	private String remarks;

}
