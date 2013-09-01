package com.test.web.spring.mvc;

import org.springframework.hateoas.ResourceSupport;

import com.test.web.jpa.model.Author;

/**
 * @author AritraChatterjee
 * 
 */
public class BookResource extends ResourceSupport {

	private long bookId;
	private String name;
	private Author author;

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
