/**
 * 
 */
package com.emart.buyer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emart.buyer.entity.Items;

/**
 * @author HongPengWen
 *
 */
public interface ItemsDao extends JpaRepository<Items, Integer>, JpaSpecificationExecutor<Items> {

	@Query(nativeQuery = true, value = "SELECT * FROM items WHERE item_name like %:itemName% ")
	List<Items> findAll(@Param("itemName") String itemName);
	
	@Query(nativeQuery = true, value = "SELECT * FROM items WHERE item_name = :itemName AND price >= :fromPrice AND price <= :toPrice ")
	List<Items> findAll(@Param("itemName") String itemName, @Param("fromPrice") double fromPrice, @Param("toPrice") double toPrice);

}
