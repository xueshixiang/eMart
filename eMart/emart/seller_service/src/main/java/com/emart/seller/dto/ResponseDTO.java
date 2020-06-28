package com.emart.seller.dto;

import com.emart.seller.entity.Items;

import lombok.Data;

@Data
public class ResponseDTO {

	public static final String REST_API_RESPONSE_CODE_SUCCESS = "I0000";
	public static final String REST_API_RESPONSE_CODE_ERROR = "E9999";

	private String responseCode;
	private String responseMessage;
	
	private String token;
	
	private Items items;

}
