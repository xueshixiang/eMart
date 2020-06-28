package com.emart.seller.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.seller.dao.SellerDao;
import com.emart.seller.entity.Items;
import com.emart.seller.exception.DataNotFoundException;
import com.emart.seller.exception.MasterValueNotFoundException;
import com.emart.seller.service.SellerService;

/**
 * @author HongPengWen
 *
 */
@Service
public class SellerServiceImpl implements SellerService {
	
	@Autowired
	private SellerDao sellerDao;

	@Override
	public void saveItems(Items items) throws MasterValueNotFoundException {

		sellerDao.save(items);
		
	}
	
	@Override
	public void deleteItems(Items items) throws MasterValueNotFoundException {
		
		sellerDao.delete(items);
		
	}

	@Override
	public void deleteItems(int itemId) throws MasterValueNotFoundException {

		sellerDao.deleteById(itemId);
		
	}

	@Override
	public void updateItemStock(int number, String itemName) throws MasterValueNotFoundException {

		sellerDao.updateItemStock(number, itemName);
		
	}

	@Override
	public Items viewStock(String itemName) throws DataNotFoundException {

		return sellerDao.viewStock(itemName);
	}

}
