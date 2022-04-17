package com.cmiyc.h2example.config;

import com.cmiyc.h2example.entity.Author;
import com.cmiyc.h2example.entity.Book;
import com.cmiyc.h2example.repository.AuthorRepository;
import com.cmiyc.h2example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class DataInitializer {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void initData() {
        if(authorRepository.count() != 0)
            return;

        Author taras = new Author(1, "Taras Shevchenko", 1814);
        Author ivan = new Author(2, "Ivan Franko", 1856);
        Author lesya = new Author(3, "Lesya Ukrainka", 1874);
        authorRepository.saveAll(List.of(taras, ivan, lesya));

        Book book1 = new Book(1, "Кобзар", 1840, taras);
        Book book2 = new Book(2, "Панські жарти", 1887, ivan);
        Book book3 = new Book(3, "Лис Микита", 1890, ivan);
        bookRepository.saveAll(List.of(book1, book2, book3));
    }
}
