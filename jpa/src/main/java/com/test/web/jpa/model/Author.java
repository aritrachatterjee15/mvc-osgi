package com.test.web.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author AritraChatterjee
 * 
 */
@NamedQueries({
		@NamedQuery(name = Author.GET_AUTHORS, query = "select distinct record"
				+ " from Author record order by record.lastName"),
		@NamedQuery(name = Author.GET_AUTHOR_BY_NAME, query = "select distinct record"
				+ " from Author record"
				+ " where record.lastName = :authorName"),
		@NamedQuery(name = Author.GET_AUTHOR_BY_ID, query = "select distinct record"
				+ " from Author record" + " where record.id = :authorId") })
@Entity
@Table(name = "AUTHORS")
public class Author {

	public static final String GET_AUTHORS = "GET_AUTHORS";
	public static final String GET_AUTHOR_BY_NAME = "GET_AUTHOR_BY_NAME";
	public static final String GET_AUTHOR_BY_ID = "GET_AUTHOR_BY_ID";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String firstName;
	private String lastName;

	public Author() {

	}

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
