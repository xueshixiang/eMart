/**
 * 
 */
package com.emart.buyer.service;

import java.util.List;

import com.emart.buyer.entity.Cart;
import com.emart.buyer.entity.Items;
import com.emart.buyer.entity.PurchaseHistory;
import com.emart.buyer.exception.DataNotFoundException;
import com.emart.buyer.exception.MasterValueNotFoundException;

/**
 * @author HongPengWen
 *
 */
public interface BuyerService {

	/**
	 * Search Items
	 * 
	 * @param userName
	 * @return
	 */
	List<Items> searchItems(String itemName) throws DataNotFoundException;
	
	/**
	 * Filter Items
	 * 
	 * @param buyer
	 */
	List<Items> filterItems(String itemName, double fromPrice, double toPrice) throws DataNotFoundException;
	
	/**
	 * Search Items
	 * 
	 * @param userName
	 * @return
	 */
	List<PurchaseHistory> searchPurchaseHistory(String buyerName) throws DataNotFoundException;
	
	void addCartItems(Cart cart) throws MasterValueNotFoundException;
	
	void deleteCartItems(Cart cart) throws MasterValueNotFoundException;
	
	double checkout(List<Cart> list) throws MasterValueNotFoundException;
	
}
