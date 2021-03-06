package com.aaa.controller;

import com.aaa.model.Book;
import com.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * syh
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * queryBooks
     *
     * @return
     */
    @GetMapping("/queryBooks")
    public List<Book> queryBooks() {
        System.out.println("book-provider-8082");
        return bookService.queryBooks();
    }
}
