package com.nx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nx.entity.Book;
import com.nx.exception.BookNotFoundException;
import com.nx.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        Book book = bookService.getBook(id);
        if (book == null) {
            throw new BookNotFoundException(id);
        }
        return book;
    }

	@PostMapping
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book existingBook = bookService.getBook(id);
        if (existingBook == null) {
            throw new BookNotFoundException(id);
        }
        return bookService.updateBook(id, book);
    }

	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Long id) {
		bookService.deleteBook(id);
	}

}
