package com.nx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nx.entity.Book;
import com.nx.repository.BookRepository;


@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Book getBook(Long id) {
		return bookRepository.findById(id).orElse(null);
	}

	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	public Book updateBook(Long id, Book book) {
		book.setId(id);
		return bookRepository.save(book);
	}

	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}

}
