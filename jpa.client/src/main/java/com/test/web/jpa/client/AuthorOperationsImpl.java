package com.test.web.jpa.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.test.web.jpa.model.Author;

/**
 * @author AritraChatterjee
 * 
 */
public class AuthorOperationsImpl implements AuthorOperations {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addAuthor(String firstName, String lastName) {
		Author author = new Author(firstName, lastName);
		entityManager.persist(author);
	}

	@Override
	public List<Author> viewAuthors() {
		Query query = entityManager.createNamedQuery(Author.GET_AUTHORS);
		@SuppressWarnings("unchecked")
		List<Author> authors = query.getResultList();
		return authors;
	}
}
