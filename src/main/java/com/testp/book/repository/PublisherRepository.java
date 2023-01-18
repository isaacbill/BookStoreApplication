package com.testp.book.repository;

import com.testp.book.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository  extends JpaRepository<Publisher, Integer> {
}
