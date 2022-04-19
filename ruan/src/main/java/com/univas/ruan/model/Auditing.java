package com.univas.ruan.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Auditing {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identifier;
	
	@ManyToOne()
	@JoinColumn(name = "DELIVERY_FK")
	private Delivery orderCode;
	
	
	private long operation;
	private Date dateTime;
	
	public Auditing() {
		
	}
	
	

	public Auditing(Delivery orderCode, long operation, Date dateTime) {
		super();
		this.orderCode = orderCode;
		this.operation = operation;
		this.dateTime = dateTime;
	}



	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public Delivery getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(Delivery orderCode) {
		this.orderCode = orderCode;
	}

	public long getOperation() {
		return operation;
	}

	public void setOperation(long operation) {
		this.operation = operation;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	
	

}
