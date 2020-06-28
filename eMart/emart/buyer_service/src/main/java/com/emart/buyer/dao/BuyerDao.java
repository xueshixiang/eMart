/**
 * 
 */
package com.emart.buyer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emart.buyer.entity.Buyer;

/**
 * @author HongPengWen
 *
 */
public interface BuyerDao extends JpaRepository<Buyer, Integer>, JpaSpecificationExecutor<Buyer> {

	@Query(nativeQuery = true, value = "SELECT * FROM buyer WHERE user_name = :userName AND password = :pwd ")
	List<Buyer> findByUserNameAndPassword(@Param("userName") String userName, @Param("pwd")  String password);
	
}
