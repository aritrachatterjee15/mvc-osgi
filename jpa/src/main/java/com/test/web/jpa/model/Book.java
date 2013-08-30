package com.test.web.jpa.model;

import javax.persistence.*;

/**
 * @author AritraChatterjee
 * 
 */
@NamedQueries({
		@NamedQuery(name = Book.GET_BOOKS, query = "select distinct record"
				+ " from Book record order by record.name"),
		@NamedQuery(name = Book.GET_BOOK_BY_ID, query = "select distinct record"
				+ " from Book record" + " where record.id = :bookId") })
@Entity
@Table(name = "BOOKS")
public class Book {

	public static final String GET_BOOKS = "GET_BOOKS";
	public static final String GET_BOOK_BY_ID = "GET_BOOK_BY_ID";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	@ManyToOne(optional = false)
	private Author author;

	public Book() {

	}

	public Book(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
