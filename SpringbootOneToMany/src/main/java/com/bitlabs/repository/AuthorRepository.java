package com.bitlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.Entity.Author;

public interface AuthorRepository extends JpaRepository <Author, Long> {
}
