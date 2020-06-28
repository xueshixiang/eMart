package com.emart.buyer.dto;

import java.util.List;

import com.emart.buyer.entity.Items;
import com.emart.buyer.entity.PurchaseHistory;

import lombok.Data;

@Data
public class ResponseDTO {

	public static final String REST_API_RESPONSE_CODE_SUCCESS = "I0000";
	public static final String REST_API_RESPONSE_CODE_ERROR = "E9999";

	private String responseCode;
	private String responseMessage;
	
	private String token;
	
	private List<Items> itemList;
	
	private List<PurchaseHistory> purchaseHistoryList;
	
	private double totalPrice;
}
