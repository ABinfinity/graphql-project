package com.graphql.learn.services;

import com.graphql.learn.entities.Book;

import java.util.List;

public interface BookService {

    //Create a book
    Book create(Book book);

    //get all books
    List<Book> getAll();

    //get single book
    Book get(int bookId);

}
