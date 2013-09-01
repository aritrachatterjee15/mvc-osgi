package com.test.web.jpa.client;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.web.jpa.model.Author;

/**
 * @author AritraChatterjee
 * 
 */
public interface AuthorOperations {

	@Transactional(readOnly = true)
	public List<Author> viewAuthors();

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void addAuthor(String firstName, String lastName);

	@Transactional(readOnly = true)
	public Author findAuthor(long authorId);
}
