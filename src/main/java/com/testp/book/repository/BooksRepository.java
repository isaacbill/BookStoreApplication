package com.testp.book.repository;

import org.springframework.data.repository.CrudRepository;

import com.testp.book.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer>{


}
