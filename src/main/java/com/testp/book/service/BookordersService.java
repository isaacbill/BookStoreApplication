package com.testp.book.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testp.book.repository.BookordersRepository;
import com.testp.book.model.Bookorders;

@Service
public class BookordersService {
	@Autowired  
	BookordersRepository bookordersRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Bookorders> getAllBookorders()   
	{  
	List<Bookorders> bookorders = new ArrayList<Bookorders>();  
	bookordersRepository.findAll().forEach(bookorders1 -> bookorders.add(bookorders1));  
	return bookorders;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Bookorders getBookordersById(int id)   
	{  
	return bookordersRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Bookorders bookorders)   
	{  
	bookordersRepository.save(bookorders);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
	bookordersRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Bookorders bookorders, int bookorderid)   
	{  
	bookordersRepository.save(bookorders);  
	}  

}
