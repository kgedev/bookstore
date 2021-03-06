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
    @Transactional
    public Book get(String id) {
        return bookRepository.get(id);
    }

    @Override
    @Transactional
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    @Transactional
    public void update(String id, Book book) {
        bookRepository.update(id, book);
    }

    @Override
    @Transactional
    public void delete(String id) {
        bookRepository.delete(id);
    }
}
