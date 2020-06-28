package com.emart.user.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emart.user.dto.ResponseDTO;
import com.emart.user.entity.Audience;
import com.emart.user.entity.Buyer;
import com.emart.user.entity.Seller;
import com.emart.user.entity.User;
import com.emart.user.exception.LoginException;
import com.emart.user.exception.MasterValueNotFoundException;
import com.emart.user.service.UserService;
import com.emart.user.util.JwtTokenUtil;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("/api/user")
public class UserController {
	
    @Autowired
    private Audience audience;
    
	@Autowired
	private UserService userService;
	
	@PostMapping("signin")
	public ResponseDTO authenticate(@RequestBody User user) {
		ResponseDTO response = new ResponseDTO();
		
		if ("1".equals(user.getUserType())) {
			response = authenticateOfBuyer((Buyer) user);
		} else {
			response = authenticateOfSeller((Seller) user);
		}
		
		return response;
	}
	
	@PostMapping("buyerSignin")
	public ResponseDTO authenticateOfBuyer(@RequestBody Buyer buyer) {
		
		ResponseDTO response = new ResponseDTO();

		try {
			userService.findBuyer(buyer.getUserName(), buyer.getPassword());
	        // 这里模拟测试, 默认登录成功，返回用户ID和角色信息
	        String userId = UUID.randomUUID().toString();
	        String role = "admin";
	        // 创建token
	        String token = JwtTokenUtil.createJWT(userId, buyer.getUserName(), role, audience);
	        log.info("### Signin Success, token={} ###", token);
	        
			response.setToken(token);
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_SUCCESS);
			response.setResponseMessage("Buyer Signin Success!!!");
			
		} catch (LoginException e) {
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_ERROR);
			response.setResponseMessage("Buyer Signin Fail!!!");
		}

		return response;
	}
	
	@PostMapping("sellerSignin")
	public ResponseDTO authenticateOfSeller(@RequestBody Seller seller) {
		
		ResponseDTO response = new ResponseDTO();

		try {
			userService.findSeller(seller.getUserName(), seller.getPassword());
	        // 这里模拟测试, 默认登录成功，返回用户ID和角色信息
	        String userId = UUID.randomUUID().toString();
	        String role = "admin";
	        // 创建token
	        String token = JwtTokenUtil.createJWT(userId, seller.getUserName(), role, audience);
	        log.info("### Signin Success, token={} ###", token);
	        
			response.setToken(token);
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_SUCCESS);
			response.setResponseMessage("Buyer Signin Success!!!");
			
		} catch (LoginException e) {
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_ERROR);
			response.setResponseMessage("Buyer Signin Fail!!!");
		}

		return response;
	}
	
	@PostMapping("buyerSignup")
	public ResponseDTO buyerSignUp(@RequestBody Buyer buyer) {
		ResponseDTO response = new ResponseDTO();
		try {
			userService.saveBuyer(buyer);
			
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_SUCCESS);
			response.setResponseMessage("Buyer Signup Success!!!");
		} catch (MasterValueNotFoundException e) {
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_ERROR);
			response.setResponseMessage("Buyer Signup Fail!!!");
		}
		
		return response;
	}
	
	@PostMapping("sellerSignup")
	public ResponseDTO sellerSignUp(@RequestBody Seller seller) {
		ResponseDTO response = new ResponseDTO();
		try {
			userService.saveSeller(seller);

			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_SUCCESS);
			response.setResponseMessage("Seller Signup Success!!!");
		} catch (MasterValueNotFoundException e) {
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_ERROR);
			response.setResponseMessage("Seller Signup Fail!!!");
		}

		return response;
	}
	
}
