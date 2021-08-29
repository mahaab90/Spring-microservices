package com.example.task.crud.services;

import java.util.List;

import com.example.task.crud.model.Book;


public interface BookService {
	List<Book> getBooks();
	
	Book getBookById(Long id);

	Book insert(Book book);

    void updateBook(Long id, Book book);

    void deleteBook(Long bookId);
}
