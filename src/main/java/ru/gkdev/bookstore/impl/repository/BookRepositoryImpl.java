package ru.gkdev.bookstore.impl.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.gkdev.bookstore.api.repository.BookRepository;
import ru.gkdev.bookstore.impl.model.Book;

import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public BookRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public String save(Book book) {
        sessionFactory.getCurrentSession().save(book);
        return book.getId();
    }

    @Override
    public Book get(String id) {
        return sessionFactory.getCurrentSession().get(Book.class, id);
    }

    @Override
    public List<Book> getAll() {
        return sessionFactory
                .getCurrentSession()
                .createQuery("from books_dev")
                .getResultList();
    }

    @Override
    public void update(String id, Book book) {
        Session session = sessionFactory.getCurrentSession();
        Book oldBook = session.byId(Book.class).load(id);
        oldBook.setTitle(book.getTitle());
        oldBook.setAuthor(book.getAuthor());
        oldBook.setGenre(book.getGenre());
        oldBook.setIsRead(book.getIsRead());

        session.flush();
    }

    @Override
    public void delete(String id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.byId(Book.class).load(id);
        session.delete(book);
    }
}
