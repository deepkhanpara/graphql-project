package com.graphql.learn.graphqlproject.services;

import com.graphql.learn.graphqlproject.entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {

    //create
    Book create(Book book);

    //get all
    List<Book> getAll();

    Book get(int bookId);
}
