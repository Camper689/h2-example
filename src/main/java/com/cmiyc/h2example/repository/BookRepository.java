package com.cmiyc.h2example.repository;

import com.cmiyc.h2example.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
