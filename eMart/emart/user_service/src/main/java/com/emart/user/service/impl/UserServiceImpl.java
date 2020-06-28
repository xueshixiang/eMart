package com.emart.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.user.dao.BuyerDao;
import com.emart.user.dao.SellerDao;
import com.emart.user.entity.Buyer;
import com.emart.user.entity.Seller;
import com.emart.user.exception.DataNotFoundException;
import com.emart.user.exception.LoginException;
import com.emart.user.exception.MasterValueNotFoundException;
import com.emart.user.service.UserService;

import lombok.NonNull;

/**
 * @author HongPengWen
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private BuyerDao buyerDao;
	
	@Autowired
	private SellerDao sellerDao;

	@Override
	public void findBuyer(@NonNull String userName, @NonNull String password) throws LoginException {
		
		try {
			Buyer buyer = buyerDao.findByUserNameAndPassword(userName);
			if(buyer != null) {
				if (!password.equals(buyer.getPassword())) {
					throw new LoginException();
				}
			}
		} catch (Exception e) {
			throw new LoginException();
		}
		
	}

	@Override
	public void findSeller(@NonNull String userName, @NonNull String password) throws LoginException {
		
		try {
			Seller seller = sellerDao.findByUserNameAndPassword(userName);
			if(seller != null) {
				if (!password.equals(seller.getPassword())) {
					throw new LoginException();
				}
			}
		} catch (Exception e) {
			throw new LoginException();
		}
		
	}

	@Override
	public void saveBuyer(Buyer buyer) throws MasterValueNotFoundException {

		buyerDao.save(buyer);
		
	}

	@Override
	public void saveSeller(Seller seller) throws MasterValueNotFoundException {

		sellerDao.save(seller);
		
	}

}
