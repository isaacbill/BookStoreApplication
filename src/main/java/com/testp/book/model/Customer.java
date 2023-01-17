package com.testp.book.model;
import jakarta.persistence.Column;  
import jakarta.persistence.Entity;  
import jakarta.persistence.Id;  
import jakarta.persistence.Table;

@Entity
@Table


public class Customer {
	@Id
	@Column
	
	private int customerId;
	@Column
	private String customerName;
	@Column
	private String customerEmail;
	
	public int getCustomerId()
	{
		return customerId;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	public String customerEmail()
	{
		return customerEmail;
	}
	public void getCustomerEmail(String customerEmail)
	{
		this.customerEmail = customerEmail;
	}
		

}
