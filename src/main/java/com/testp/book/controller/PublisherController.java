package com.testp.book.controller;

import com.testp.book.model.Publisher;
import com.testp.book.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PublisherController {
    @Autowired
    PublisherService publisherService;
    //creating a get mapping that retrieves all the publisher detail from the database
    @GetMapping("/publisher")
    private List<Publisher> getAllPublishers()
    {
        return publisherService.getAllPublishers();
    }
    //creating a get mapping that retrieves the detail of a specific publisher
    @GetMapping("/publisher/{publisherId}")
    private Publisher getPublisher(@PathVariable("publisherId") int publisherId)
    {
        return publisherService.getPublisherById(publisherId);
    }
    //creating a delete mapping that deletes a specified publisher
    @DeleteMapping("/publisher/{publisherId}")
    private void deletePublisher(@PathVariable("publisherId") int publisherId)
    {
        publisherService.delete(publisherId);
    }
    //creating post mapping that post the publisher detail in the database
    @PostMapping("/publisher")
    private int savePublisher(@RequestBody Publisher publisher)
    {
        publisherService.saveOrUpdate(publisher);
        return publisher.getPublisherId();
    }
    //creating put mapping that updates the publisher detail
    @PutMapping("/publisher")
    private Publisher update(@RequestBody Publisher publisher)
    {
        publisherService.saveOrUpdate(publisher);
        return publisher;
    }

}
