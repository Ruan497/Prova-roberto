package com.univas.ruan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univas.ruan.model.Delivery;

@Repository
public interface DeliveryDAO extends JpaRepository<Delivery, Long> {
	

	

}
