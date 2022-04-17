package com.cmiyc.h2example.controller;

import com.cmiyc.h2example.entity.Author;
import com.cmiyc.h2example.entity.Book;
import com.cmiyc.h2example.repository.AuthorRepository;
import com.cmiyc.h2example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/authors")
    public List<Author> authorList() {
        return authorRepository.findAll();
    }

    @GetMapping("/books")
    public List<Book> bookList() {
        return bookRepository.findAll();
    }
}
