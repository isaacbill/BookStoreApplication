package com.testp.book.service;


import com.testp.book.model.Publisher;
import com.testp.book.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class PublisherService {
    @Autowired
    PublisherRepository publisherRepository;
    public List<Publisher> getAllPublishers()
    {
        List<Publisher> publishers = new ArrayList<>();
        publisherRepository.findAll().forEach(publishers1 -> publishers.add(publishers1));
        return publishers;
    }
    //getting a specific record by using the method findById() of CrudRepository
    public Publisher getPublisherById(int id)
    {
        return publisherRepository.findById(id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Publisher publisher)
    {
        publisherRepository.save(publisher);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        publisherRepository.deleteById(id);
    }
    //updating a record
    public void update(Publisher publisher, int publisherId)
    {
        publisherRepository.save(publisher);
    }
}
