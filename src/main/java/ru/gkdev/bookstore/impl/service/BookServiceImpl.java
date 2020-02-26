package ru.gkdev.bookstore.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gkdev.bookstore.api.repository.BookRepository;
import ru.gkdev.bookstore.api.service.BookService;
import ru.gkdev.bookstore.impl.model.Book;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    @Transactional
    public String save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book get(String id) {
        return null;
    }

    @Override
    @Transactional
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public void update(String id, Book book) {

    }

    @Override
    public void delete(String id) {

    }
}
