package com.univas.ruan;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.univas.ruan.dao.DeliveryDAO;
import com.univas.ruan.model.Delivery;

@SpringBootApplication
public class RuanApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuanApplication.class, args);
	}
	
	@Autowired
	private DeliveryDAO delivdao;
	
	public void run(String... args) throws Exception {
		Delivery delivery = new Delivery("123.456.789.00", new Date(), "11222000", "concluido");
		delivdao.save(delivery);

	}

}
