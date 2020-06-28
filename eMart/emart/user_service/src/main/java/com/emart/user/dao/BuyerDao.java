/**
 * 
 */
package com.emart.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emart.user.entity.Buyer;

/**
 * @author HongPengWen
 *
 */
public interface BuyerDao extends JpaRepository<Buyer, Integer>, JpaSpecificationExecutor<Buyer> {

	@Query(nativeQuery = true, value = "SELECT * FROM buyer WHERE user_name = :userName ")
	Buyer findByUserNameAndPassword(@Param("userName") String userName);
	
}
