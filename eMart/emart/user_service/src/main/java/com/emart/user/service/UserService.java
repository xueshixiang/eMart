/**
 * 
 */
package com.emart.user.service;

import com.emart.user.entity.Buyer;
import com.emart.user.entity.Seller;
import com.emart.user.exception.LoginException;
import com.emart.user.exception.MasterValueNotFoundException;

/**
 * @author HongPengWen
 *
 */
public interface UserService {

	/**
	 * Buyer Login
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	void findBuyer(String userName, String password)  throws LoginException;
	
	/**
	 * Seller Login
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	void findSeller(String userName, String password)  throws LoginException;
	
	/**
	 * Buyer signup
	 * 
	 * @param buyer
	 */
	void saveBuyer(Buyer buyer) throws MasterValueNotFoundException;
	
	/**
	 * Seller signup
	 * 
	 * @param seller
	 */
	void saveSeller(Seller seller) throws MasterValueNotFoundException;
	
	
	
}
