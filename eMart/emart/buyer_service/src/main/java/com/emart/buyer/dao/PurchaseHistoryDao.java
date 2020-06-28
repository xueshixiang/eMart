/**
 * 
 */
package com.emart.buyer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emart.buyer.entity.PurchaseHistory;

/**
 * @author HongPengWen
 *
 */
public interface PurchaseHistoryDao extends JpaRepository<PurchaseHistory, Integer>, JpaSpecificationExecutor<PurchaseHistory> {

	@Query(nativeQuery = true, value = "SELECT P.* FROM purchase_history P, buyer B where P.buyer_id = B.id AND B.user_name = :buyerName ")
	List<PurchaseHistory> findAll(@Param("buyerName") String buyerName);
	
}
