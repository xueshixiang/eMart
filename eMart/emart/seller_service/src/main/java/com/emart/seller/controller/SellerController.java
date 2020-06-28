package com.emart.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emart.seller.dto.ResponseDTO;
import com.emart.seller.entity.Items;
import com.emart.seller.exception.DataNotFoundException;
import com.emart.seller.exception.MasterValueNotFoundException;
import com.emart.seller.service.SellerService;

@RestController
@RequestMapping("/api/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@PostMapping("addItems")
	public ResponseDTO addItems(@RequestBody Items items) {
		
		ResponseDTO response = new ResponseDTO();
		try {
			sellerService.saveItems(items);

			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_SUCCESS);
			response.setResponseMessage("Add Items Success!!!");
		} catch (MasterValueNotFoundException e) {
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_ERROR);
			response.setResponseMessage("Add Items Fail!!!");
		}

		return response;
	}
	
	@PostMapping("deleteItems")
	public ResponseDTO deleteItems(@RequestBody Items items) {
		
		ResponseDTO response = new ResponseDTO();
		try {
			sellerService.deleteItems(items);

			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_SUCCESS);
			response.setResponseMessage("Delete Items Success!!!");
		} catch (MasterValueNotFoundException e) {
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_ERROR);
			response.setResponseMessage("Delete Items Fail!!!");
		}

		return response;
	}
	
	@PostMapping("updateItemStock")
	public ResponseDTO updateItemStock(@RequestBody Items items) {
		
		ResponseDTO response = new ResponseDTO();
		try {
			sellerService.updateItemStock(items.getStockNumber(), items.getItemName());

			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_SUCCESS);
			response.setResponseMessage("Update Item Stock Success!!!");
		} catch (MasterValueNotFoundException e) {
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_ERROR);
			response.setResponseMessage("Delete Item Stock Fail!!!");
		}

		return response;
	}
	
	@PostMapping("viewStock")
	public ResponseDTO viewStock(@RequestBody Items items) {
		
		ResponseDTO response = new ResponseDTO();
		try {
			Items result = sellerService.viewStock(items.getItemName());

			response.setItems(result);
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_SUCCESS);
			response.setResponseMessage("View Item Stock Success!!!");
		} catch (DataNotFoundException e) {
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_ERROR);
			response.setResponseMessage("View Item Stock Fail!!!");
		}

		return response;
	}
}
