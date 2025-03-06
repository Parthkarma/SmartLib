package com.application.lmsportal.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="authors")
public class Author {
 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 private Long id;
 @Column(name="name" , nullable = false, unique = true ,  length = 100 )
 private String name;
 @Column(name="description" , nullable = false,  length = 100 )
 private String description;

 @ManyToMany(mappedBy = "authors" , cascade = CascadeType.ALL)
 private Set<Book> books = new HashSet<Book>() ;

}
