package com.sincere.springh2demo.repository;

import com.sincere.springh2demo.pojo.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {
}
