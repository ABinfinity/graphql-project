package com.graphql.learn.controllers;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    //create
    @PostMapping("/createBook")
    public Book create(@RequestBody Book book){
        return this.bookService.create(book);
    }


    //getAll books
    @GetMapping("/getAllBooks")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }


    //get single book
    @GetMapping("/getBook/{bookId}")
    public Book getOne(@PathVariable int bookId){
        return this.bookService.get(bookId);
    }
}
