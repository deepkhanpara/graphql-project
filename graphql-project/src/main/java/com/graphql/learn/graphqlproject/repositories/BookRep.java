package com.graphql.learn.graphqlproject.repositories;

import com.graphql.learn.graphqlproject.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRep extends JpaRepository<Book, Integer> {

}
