package ru.gkdev.bookstore.api.service;

import ru.gkdev.bookstore.impl.model.Book;

import java.util.List;

public interface BookService {
    //Save the record
    String save(Book book);

    //Get a single record
    Book get(String id);

    //Get all the records
    List<Book> getAll();

    //Update the record
    void update(String id, Book book);

    //Delete a record
    void delete(String id);
}
