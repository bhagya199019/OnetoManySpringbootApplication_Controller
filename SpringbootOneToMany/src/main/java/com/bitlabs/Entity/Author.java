package com.bitlabs.Entity;

import java.util.HashSet;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "AUTHOR_TBL")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Author {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String name;
 
 @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
 @JsonIgnoreProperties("author")
 private Set<Book> books = new HashSet<>();
 
 // Constructors, getters, and setters
}
