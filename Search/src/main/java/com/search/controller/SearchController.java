package com.search.controller;

import java.util.List;


import com.search.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.entity.Book;


import com.search.service.SearchService;
@RestController
@RequestMapping("search")
@CrossOrigin(origins="http://localhost:3000")
public class SearchController {
	@Autowired
	private SearchService service;
	@PostMapping("/")
	public Book addBook(@RequestBody Book record) {
		return this.service.save(record);
	}

	@PutMapping("/{id}")
	public Book updateBook(@RequestBody Book record) {
		return this.service.save(record);
	}

	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable long id) {
		this.service.delete(id);
	}
	
	@GetMapping("/{id}")
	public Object getBook(@PathVariable("id") long id ) {
	return this.service.getBookById(id);
	}
	

	@GetMapping("/")
	public List<Book> getBook() {
		return this.service.findAll();
	}

}
