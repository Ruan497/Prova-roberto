package com.univas.ruan.DTO;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.univas.ruan.model.Delivery;

public class DelivDTO {
	
	private long orderCode;

	@NotNull()
	@NotEmpty()
	private String receiverCpf;

	@NotNull()
	@NotEmpty()
	private Date deliveryDate;

	@NotNull()
	@NotEmpty()
	private String cep;

	@NotNull()
	@NotEmpty()
	private String status;

	public DelivDTO() {

	}


	public DelivDTO(Delivery delivery) {
		this.orderCode = delivery.getOrderCode();
		this.receiverCpf = delivery.getReceiverCPF();
		this.deliveryDate = delivery.getDeliveryDate();
		this.cep = delivery.getCep();
		this.status = delivery.getStatus();
	}

	public String getReceiverCpf() {
		return receiverCpf;
	}

	public void setReceiverCpf(String receiverCpf) {
		this.receiverCpf = receiverCpf;
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
