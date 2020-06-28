/**
 * 
 */
package com.emart.seller.service;

import com.emart.seller.entity.Items;
import com.emart.seller.exception.DataNotFoundException;
import com.emart.seller.exception.MasterValueNotFoundException;

/**
 * @author HongPengWen
 *
 */
public interface SellerService {
	
	void saveItems(Items items) throws MasterValueNotFoundException;
	
	void deleteItems(Items items) throws MasterValueNotFoundException;
	
	void deleteItems(int itemId) throws MasterValueNotFoundException;
	
	void updateItemStock(int number, String itemName) throws MasterValueNotFoundException;
	
	Items viewStock(String itemName) throws DataNotFoundException;
}
