package com.ecommerce.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.project.user.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, String>{

}
