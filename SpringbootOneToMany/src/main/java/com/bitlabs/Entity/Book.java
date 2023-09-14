package com.bitlabs.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "BOOK_TBL")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String title;
 
 @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
 
 @JoinTable(name = "AUTHOR_BOOK_TABLE",
 joinColumns = {
         @JoinColumn(name = "book__id", referencedColumnName = "id")
 },
 inverseJoinColumns = {
         @JoinColumn(name = "author_id", referencedColumnName = "id")
 }
)

 private Author author;
 
 // Constructors, getters, and setters
}
