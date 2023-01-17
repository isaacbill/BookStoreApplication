package com.testp.book.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.testp.book.model.Author;
//import org.springframework.data.repository.CrudRepository;


//repository extends CrudRepository
public interface AuthorRepository extends JpaRepository <Author, Integer>{

}
