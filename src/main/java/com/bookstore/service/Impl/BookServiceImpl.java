package com.bookstore.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dto.BooksDto;
import com.bookstore.entity.Books;
import com.bookstore.repository.BooksRepository;
import com.bookstore.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BooksRepository booksRepository;
	
	@Override
	public BooksDto addBook(BooksDto booksDto) {
		Books books = new Books();
		books.setBookName(booksDto.getBookName());
		books.setAuthor(booksDto.getAuthor());
		books.setCast(booksDto.getCast());
		Books savedBooks = booksRepository.save(books);
		booksDto.setId(savedBooks.getId());
		booksDto.setBookName(savedBooks.getBookName());
		booksDto.setAuthor(savedBooks.getAuthor());
		booksDto.setCast(savedBooks.getCast());
		return booksDto;
	}

}
