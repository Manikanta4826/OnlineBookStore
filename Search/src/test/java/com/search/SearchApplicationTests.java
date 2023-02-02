package com.search;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.search.entity.Book;
import com.search.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.search.repository.TrainRepository;
import com.search.service.SearchService;

@RunWith(SpringRunner.class)
@SpringBootTest
class SearchApplicationTests {

	@Autowired
	private SearchService service;
	
	@MockBean
	private BookRepository bookrepo;
// test fake data for get all Train	
	@Test
	public void getTrainTest() {
		when(bookrepo.findAll()).thenReturn(Stream.
				of(new Book(101, "1234", "king", "drama", "vic")).collect(Collectors.toList()));
		assertEquals(1, service.findAll().size());
	}

	//this is also for get all Train
	@Test
	public void getAllTrainTest() {
		List<Book> list = new ArrayList<Book>();
		Book book1=new Book(101, "1234", "king", "drama", "vic");
		Book book2=new Book(102, "5678", "Naruto", "action", "rocky");
		Book book3=new Book(103, "9101", "Salaar", "comedy", "vinnu");
		
		
		list.add(book1);
		list.add(book2);
		list.add(book3);
		
		
		when(bookrepo.findAll()).thenReturn(list);
		
		//test
		List<Book> trainList=service.findAll();
		assertEquals(3, trainList.size());
		verify(bookrepo, times(1)).findAll();
	}

//	test for save Train
	@Test
	public void saveTest() {
		Book book=new Book(101, "1234", "king", "drama", "vic");
		when(bookrepo.save(book)).thenReturn(book);
		assertEquals(book, service.save(book));
	}
	
//	test for delete Train
	@Test
	public void deleteTrainTest() {
		long id=101;
		Book book=new Book(101, "1234", "king", "drama", "vic");
		service.delete(id);
		verify(bookrepo,times(1)).deleteById(id);
	}
	
}
