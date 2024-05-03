package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {
	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("Book 1");
		b1.setAuthor("Author 1");
		b1.setDesc("Description 1");
		b1.setPrice(250.76);
		b1.setPages(2213);


		Book b2 = new Book();
		b2.setTitle("Book 2");
		b2.setAuthor("Author 2");
		b2.setDesc("Description 2");
		b2.setPrice(250.76);
		b2.setPages(2213);

		this.bookService.create(b1);
		this.bookService.create(b2);
	}
}
