package ru.gkdev.bookstore.impl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.gkdev.bookstore.api.service.BookService;
import ru.gkdev.bookstore.impl.model.Book;

import java.util.List;

@RestController
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

    @PostMapping("/book/save")
    public ResponseEntity<?> save(@RequestBody Book book) {
        String bookId = bookService.save(book);
        return ResponseEntity.ok().body("Book created with id: " + bookId);
    }
}
