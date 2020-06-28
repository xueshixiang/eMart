/**
 * 
 */
package com.emart.seller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emart.seller.entity.Items;

/**
 * @author HongPengWen
 *
 */
public interface SellerDao extends JpaRepository<Items, Integer>, JpaSpecificationExecutor<Items> {

	@Query(nativeQuery = true, value = "UPDATE items SET stock_number = :stockNumber WHERE item_name = :itemName ")
	void updateItemStock(@Param("stockNumber") int number, @Param("itemName")String itemName);

	@Query(nativeQuery = true, value = "SEARCH * FROM items WHERE item_name = :itemName ")
	Items viewStock(@Param("itemName")String itemName);

}
