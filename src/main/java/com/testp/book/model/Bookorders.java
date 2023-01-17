package com.testp.book.model;
import jakarta.persistence.Entity;  
import jakarta.persistence.Id;  
import jakarta.persistence.Table;

@Entity
@Table(name="bookorder")
public class Bookorders {
	//defining primary key
	@Id
	private int bookorderid;
	private String orderstatus;
	private int customerid;
	private int book_id;
	
	
	
	
	public Bookorders() {
	}
	
	public Bookorders(String orderstatus, int customerid, int book_id) {
		this.orderstatus = orderstatus;
		this.customerid = customerid;
		this.book_id = book_id;
	}
	public Bookorders(int bookorderid, String orderstatus, int customerid, int book_id) {
		this.bookorderid = bookorderid;
		this.orderstatus = orderstatus;
		this.customerid = customerid;
		this.book_id = book_id;
	}
	
	
	public int getBookorderid()
	{
		return bookorderid;
	}
	public void setBookorderid(int bookorderid)
	{
		this.bookorderid = bookorderid;
	}
	public String getOrderstatus()
	{
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus)
	{
		this.orderstatus = orderstatus;
	}
	public int getCustomerid()
	{
		return customerid;
	}
	public void setCustomerid(int customerId)
	{
		this.customerid = customerId;
	}
	
	public int getBookid()
	{
		return book_id;
	}
	public void setBookid(int book_id)
	{
		this.book_id = book_id;
	}

}
