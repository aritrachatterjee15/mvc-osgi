package com.test.web.jpa.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.test.web.jpa.model.Author;
import com.test.web.jpa.model.Book;

/**
 * @author AritraChatterjee
 * 
 */
public class BookInventoryImpl implements BookInventory {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addBook(String bookName, String authorName) {
		Book book = new Book(bookName);
		book.setAuthor(getAuthor(authorName));
		entityManager.persist(book);
	}

	@Override
	public List<Book> viewBooks() {
		Query query = entityManager.createNamedQuery(Book.GET_BOOKS);
		@SuppressWarnings("unchecked")
		List<Book> books = query.getResultList();
		return books;
	}

	@Override
	public void addAuthor(String firstName, String lastName) {
		Author author = new Author(firstName, lastName);
		entityManager.persist(author);
	}

	private Author getAuthor(String lastName) {
		Query query = entityManager.createNamedQuery(Author.GET_AUTHOR_BY_NAME);
		query.setParameter("authorName", lastName);
		return (Author) query.getSingleResult();
	}
}
