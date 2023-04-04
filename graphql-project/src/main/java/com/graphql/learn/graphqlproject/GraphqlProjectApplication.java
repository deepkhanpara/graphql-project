package com.graphql.learn.graphqlproject;

import com.graphql.learn.graphqlproject.entities.Book;
import com.graphql.learn.graphqlproject.services.BookService;
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
		b1.setTitle("complete Reference");
		b1.setDesc("For learning Java");
		b1.setPages(2000);
		b1.setPrice(500);
		b1.setAuthor("XYZ");

		Book b2 = new Book();
		b2.setTitle("think java");
		b2.setDesc("For starting java");
		b2.setPages(3000);
		b2.setPrice(700);
		b2.setAuthor("ABC");

		Book b3 = new Book();
		b3.setTitle("head first to java");
		b3.setDesc("For deep dive java");
		b3.setPages(4000);
		b3.setPrice(900);
		b3.setAuthor("PQR");


		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
	}
}
