package com.testp.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.testp.book.service.BookordersService;
import com.testp.book.model.Bookorders;

@RestController
public class BookordersController {
	//autowire the BooksService class  
	@Autowired  
	BookordersService bookordersService;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/bookorder")  
	private List<Bookorders> getAllBookorders()   
	{  
	return bookordersService.getAllBookorders();  
	}  
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/bookorders/{bookorderid}")  
	private Bookorders getBooks(@PathVariable("bookorderid") int bookorderid)   
	{  
	return bookordersService.getBookordersById(bookorderid);  
	}  
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/bookorders/{bookorderid}")  
	private void deleteBook(@PathVariable("bookorderid") int bookorderid)   
	{  
	bookordersService.delete(bookorderid);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/bookorders")  
	private int saveBook(@RequestBody Bookorders bookorders)   
	{  
	bookordersService.saveOrUpdate(bookorders);  
	return bookorders.getBookid();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/bookorders")  
	private Bookorders update(@RequestBody Bookorders bookorders)   
	{  
	bookordersService.saveOrUpdate(bookorders);  
	return bookorders;  
	}  

}
