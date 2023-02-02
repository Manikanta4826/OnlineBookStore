package com.search.repository;

import com.search.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, Long> {

    Object findById(int i);




}
