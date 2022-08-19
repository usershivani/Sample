package com.sample.POC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.POC.model.Book;

import antlr.collections.List;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	public List<Book> findBybookName(String name);




}
