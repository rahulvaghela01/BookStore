package com.bookstore.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.bookstore.dto.BooksDto;

public interface BookService {

	public BooksDto addBook(@RequestBody BooksDto booksDto);
	
}
