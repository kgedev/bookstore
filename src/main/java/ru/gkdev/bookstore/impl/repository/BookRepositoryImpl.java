package ru.gkdev.bookstore.impl.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.gkdev.bookstore.api.repository.BookRepository;
import ru.gkdev.bookstore.impl.model.Book;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public String save(Book book) {
        return null;
    }

    @Override
    public Book get(String id) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return sessionFactory
                .getCurrentSession()
                .createQuery("SELECT book FROM Books book", Book.class)
                .getResultList();
    }

    @Override
    public void update(String id, Book book) {

    }

    @Override
    public void delete(String id) {

    }
}
