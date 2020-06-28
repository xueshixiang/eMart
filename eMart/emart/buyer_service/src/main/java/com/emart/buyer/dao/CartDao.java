/**
 * 
 */
package com.emart.buyer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.emart.buyer.entity.Cart;

/**
 * @author HongPengWen
 *
 */
public interface CartDao extends JpaRepository<Cart, Integer>, JpaSpecificationExecutor<Cart> {

//	@Query(nativeQuery = true, value = "SELECT P.* FROM purchase_history P, buyer B where P.buyer_id = B.id AND B.user_name = :buyerName ")
//	List<PurchaseHistory> findAll(@Param("buyerName") String buyerName);
	
}
