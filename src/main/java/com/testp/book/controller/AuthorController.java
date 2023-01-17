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
import com.testp.book.model.Author;
import com.testp.book.service.AuthorService;


@RestController
public class AuthorController {
	@Autowired
    AuthorService authorService;
    //retrieves all the authors detail from the database
    @GetMapping("/author")
    private List<Author>getAllAuthor()
    {
        return authorService.getAllAuthor(); 
    }
    //retrieves a specified book
    @GetMapping("/author/{authorId}")
    private Author getAuthor(@PathVariable("authorId") int authorId)
    {
        return authorService.getAuthorById(authorId);
    }
    //deletes a specified book
    @DeleteMapping("/author/{authorId}")
    private void deleteAuthor(@PathVariable("authorId") int authorId)
    {
        authorService.delete(authorId);
    }
    //post book in database
    @PostMapping("/author")
    private int saveAuthor(@RequestBody Author author)
    {
        authorService.saveOrUpdate(author);
        return author.getAuthorId();

    }
    //updates book details
    @PutMapping("/author")
    private Author update(@RequestBody Author author)
    {
        authorService.saveOrUpdate(author);
        return author;
    }

}
