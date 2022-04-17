package com.cmiyc.h2example.repository;

import com.cmiyc.h2example.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
