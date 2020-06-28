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
@Table(name="cart")
public class Cart {
	
	@Id
	private int id;
	private int buyerId;
	private int sellerId;
	private int transactionId;
	private int itemId;
	private double price;
	private int numberOfItems;
	private String dateTime;
	private String remarks;

}
