package com.application.lmsportal.repository;

import com.application.lmsportal.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
