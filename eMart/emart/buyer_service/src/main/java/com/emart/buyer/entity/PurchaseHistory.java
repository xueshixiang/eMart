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
@Table(name="purchase_history")
public class PurchaseHistory {
	
	@Id
	private int id;
	private int buyerId;
	private int sellerId;
	private int transactionId;
	private int itemId;
	private int numberOfItems;
	private String dateTime;
	private String remarks;

}
