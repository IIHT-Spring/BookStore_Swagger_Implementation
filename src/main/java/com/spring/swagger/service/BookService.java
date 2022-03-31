package com.spring.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.swagger.dao.BookRepository;
import com.spring.swagger.model.Book;

@Service
public class BookService {
	@Autowired
	private BookRepository repository;
	
	public String saveBook(Book book) {
		repository.save(book);
		return "book saved with id" ;
	}
	
	
	public Book getBook(int bookId) {
		 return repository.findById(bookId).orElse(null);
	}
	
	public List<Book> removeBook(int bookId) {
		repository.deleteById(bookId);
		return repository.findAll();
	}
		
}
	
