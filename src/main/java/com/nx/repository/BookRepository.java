package com.nx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nx.entity.Book;


public interface BookRepository  extends JpaRepository<Book, Long>{

}
