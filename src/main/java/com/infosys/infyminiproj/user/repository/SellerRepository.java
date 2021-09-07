package com.infosys.infyminiproj.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infosys.infyminiproj.user.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, String> {

	Seller findByEmail(String Email);
	
//	@Query("FROM Product as product "
//    		+ " WHERE product.sellerid = :sellerid")   
//	public Seller getProducts(@Param("sellerid") String sellerid);
}

