package com.application.lmsportal.service;

import com.application.lmsportal.entity.Book;
import com.application.lmsportal.repository.BookRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Getter
@Setter
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findBookById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        return book;
    }

    public void createBook(Book book){
        bookRepository.save(book);
    }

    public void updateBook(Book book){
        bookRepository.save(book);
    }

    public void deleteBook(Long id){
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        bookRepository.deleteById(book.getId());
    }
}
