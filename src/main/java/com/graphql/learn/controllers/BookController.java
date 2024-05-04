package com.graphql.learn.controllers;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import lombok.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //create
    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setPrice(book.getPrice());
        b.setPages(book.getPages());
        b.setAuthor(book.getAuthor());
        b.setDesc(book.getDesc());

        return this.bookService.create(b);
    }


    //getAll books
    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }


    //get single book
    @QueryMapping("getBook")
    public Book getOne(@Argument int bookId){
        return this.bookService.get(bookId);
    }
}


@Getter
@Setter
class BookInput{
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;

}
