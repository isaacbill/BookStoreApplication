package com.testp.book.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testp.book.model.Author;
import com.testp.book.repository.AuthorRepository;
import java.util.ArrayList;
import java.util.List;


//defining business logic
@Service

public class AuthorService {

	@Autowired
    AuthorRepository authorRepository;

    //getting all authors records
    public List<Author> getAllAuthor()
    {
        List<Author> author = new ArrayList<Author>();
        authorRepository.findAll().forEach(author1 -> author.add(author1));
        return author;
    }

    //getting a specific record
    public Author getAuthorById(int id)
    {
        return authorRepository.findById(id).get();
    }

    //saving a specific record
    public void saveOrUpdate(Author author)
    {
        authorRepository.save(author);
    }

    //deleting a specific record
    public void delete(int id)
    {
        authorRepository.deleteById(id);
    }

    //updating a record
    public void update(Author author, int authorId)
    {
        authorRepository.save(author);
    }

}
