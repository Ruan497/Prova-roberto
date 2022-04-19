package com.univas.ruan.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Delivery {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull()
	@NotEmpty()
	private long orderCode;
	
	@NotNull()
	private String receiverCPF;
	
	@NotNull()
	private Date deliveryDate;
	
	@NotNull()
	private String cep;
	
	@NotNull()
	private String status;
	
	public Delivery() {
		
	}
	
	public Delivery(String receiverCPF, Date deliveryDate, String cep, String status) {
		this.receiverCPF = receiverCPF;
		this.deliveryDate = deliveryDate;
		this.cep = cep;
		this.status = status;
	}

	public long getOrderCode() {
		return orderCode;
	}
	
	public void setOrderCode(int orderCode) {
		this.orderCode = orderCode;
	}
	
	public String getReceiverCPF() {
		return receiverCPF;
	}
	
	public void setReceiverCPF(String receiverCPF) {
		this.receiverCPF = receiverCPF;
	}
	
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
