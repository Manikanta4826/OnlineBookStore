package com.search.service;

import java.util.List;

import com.search.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.repository.BookRepository;
@Service
public class SearchService {

	@Autowired
	private BookRepository bookrepo;

	public Book save(Book book) {
		return bookrepo.save(book);
	}

	public void delete(long id) {
		bookrepo.deleteById(id);
	}

	public List<Book> findAll() {
		return bookrepo.findAll();
	}

	public Object getBookById(long id) {
		return bookrepo.findById(id);
	}

	

	

	

	
		
}