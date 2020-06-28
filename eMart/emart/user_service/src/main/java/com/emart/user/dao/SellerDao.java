/**
 * 
 */
package com.emart.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emart.user.entity.Seller;

/**
 * @author HongPengWen
 *
 */
public interface SellerDao extends JpaRepository<Seller, Integer>, JpaSpecificationExecutor<Seller> {

	@Query(nativeQuery = true, value = "SELECT * FROM seller WHERE user_name = :userName ")
	Seller findByUserNameAndPassword(@Param("userName") String userName);
}
