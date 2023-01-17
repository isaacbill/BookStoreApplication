package com.testp.book.model;
import jakarta.persistence.Column;  
import jakarta.persistence.Entity;  
import jakarta.persistence.Id;  
import jakarta.persistence.Table;

@Entity
@Table

public class Publisher {
	@Id
	@Column
	
	private int publisherId;
	@Column
	private String publisherName;
	@Column
	private String location;
	
	public int getPublisherId()
	{
		return publisherId;
	}
	public void setPublisherId(int publisherId)
	{
		this.publisherId = publisherId;
	}
	public String getPublisherName()
	{
		return publisherName;
	}
	public void setPublisherName(String publisherName)
	{
		this.publisherName = publisherName;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	
}
