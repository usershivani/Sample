package com.sample.POC.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sample.POC.model.Book;
import com.sample.POC.repository.BookRepository;

import antlr.collections.List;

@RestController
public class BookController {
	@Autowired BookRepository bookRepository;
	
	@PostMapping("/savebook")
	public String insertBook(@RequestBody Book book) {
		return (List<Book>)bookRepository.save(book);
		
	} 
	@GetMapping("/getAllbooks")
	public List<Book> getBook() {
		 return (List<Book>)bookRepository.findAll();
		
	} 
	
	/*@GetMapping("/getByBookName/{name}")
	public List<Book> getBook(@PathVariable("name") String BookName){
		return (List<Book>) bookRepository.findBybookName(BookName);
	}*/
	
	@GetMapping("/getByBookId/{bookid}")
	public Optional<Book> getBook(@PathVariable("bookid") Long id){
		return bookRepository.findById(id);
	}
	

}
