package com.bitlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.Entity.Book;

public interface BookRepository extends JpaRepository <Book, Long> {
}
