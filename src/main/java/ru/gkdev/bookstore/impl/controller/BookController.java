package ru.gkdev.bookstore.impl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gkdev.bookstore.api.service.BookService;
import ru.gkdev.bookstore.impl.model.Book;

import java.util.List;

@Controller
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAll() {
        List<Book> bookList = bookService.getAll();
        return ResponseEntity.ok().body(bookList);
    }
}
