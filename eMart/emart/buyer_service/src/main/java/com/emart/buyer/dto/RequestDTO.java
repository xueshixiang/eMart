package com.emart.buyer.dto;

import java.util.List;

import com.emart.buyer.entity.Cart;

import lombok.Data;

@Data
public class RequestDTO {

	private List<Cart> cartList;
	
}
