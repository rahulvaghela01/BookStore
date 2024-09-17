package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.dto.BooksDto;
import com.bookstore.service.BookService;

@RestController
@RequestMapping("/v1/books")
public class BooksController {

	@Autowired
	private BookService bookService;
	
	public ResponseEntity<BooksDto> addBooks(@RequestBody BooksDto booksDto){
		BooksDto addBook = bookService.addBook(booksDto);
		return ResponseEntity.ok(addBook);
	}
	
	@GetMapping("/stole")
	public String getBookStore() {
		return "This is Our Virtual Store 🐱‍👤 \n welcome to Our Stole";
	}
}
