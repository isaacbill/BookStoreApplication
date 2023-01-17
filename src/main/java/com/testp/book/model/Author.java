package com.testp.book.model;
import jakarta.persistence.Entity;  
import jakarta.persistence.Id;  
import jakarta.persistence.Table;

//mark class as an entity
@Entity

//defining class name as table name
@Table

public class Author {

	@Id
	private int authorid;
	private String fname;
	private String lastname;
	private int age;
	private String location;
	
	
	
	
	public Author() {

	}
	
	public Author(String fname,String lastname, int age, String location) {
		this.fname = fname;
		this.lastname = lastname;
		this.age = age;
		this.location = location;
	}
	
	public Author(int authorid,String fname, String lastname, int age, String location) {
		this.authorid = authorid;
		this.fname = fname;
		this.lastname = lastname;
		this.age = age;
		this.location = location;
	}
	
	
	
	public int getAuthorId()
	{
		return authorid;
	}
	public void setAuthorId(int authorid)
	{
		this.authorid = authorid;	
	}
	public String getFname()
	{
		return fname;
	}
	public void setFname(String fname)
	{
		this.fname = fname;
	}
	public String getLastName()
	{
		return lastname;
	}
	public void setLastName(String lastname)
	{
		this.lastname = lastname;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getlocation()
	{
		return location;
	}
	public void setlocation(String location)
	{
		this.location = location;
	}
	
	
	
}
