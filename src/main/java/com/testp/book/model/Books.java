package com.testp.book.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  

public class Books {
 
//Defining book id as primary key  
@Id  
private int bookid; 
private String author;  
private String bookname;  
private int price; 
private String booktype;




public Books() {
}
public Books(String author, String bookname, int price, String booktype) {
	this.author = author;
	this.bookname = bookname;
	this.price = price;
	this.booktype = booktype;
	
}
public Books(int bookid, String author, String bookname, int price, String booktype) {
	this.bookid = bookid;
	this.author = author;
	this.bookname = bookname;
	this.price = price;
	this.booktype = booktype;
	
}
public int getBookid()   
{
	return bookid;  
}

public void setBookid(int bookid)   
{
	this.bookid = bookid;  
}  
public String getBookname()  
{
	return bookname;  
}  
public void setBookname(String bookname)   
{
	this.bookname = bookname;  
}  
public String getAuthor()   
{
	return author;  
}  
public void setAuthor(String author)   
{
	this.author = author;  
}  
public int getPrice()   
{
	return price;  
}  
public void setPrice(int price)   
{
	this.price = price;  
}
public String getbooktype()   
{
	return booktype;  
}  
public void setbooktype(String booktype)   
{
	this.booktype = booktype;  
}

} 
