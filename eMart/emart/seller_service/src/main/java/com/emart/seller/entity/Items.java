/**
 * 
 */
package com.emart.seller.entity;

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
@Table(name="items")
public class Items {
	
	@Id
	private int id;
	private int categoryId;
	private int subcategoryId;
	private double price;
	private String itemName;
	private String description;
	private int stockNumber;
	private String remarks;

}
