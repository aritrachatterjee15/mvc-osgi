package com.test.web.spring.mvc.another;

import org.springframework.hateoas.ResourceSupport;

/**
 * @author AritraChatterjee
 * 
 */
public class AuthorResource extends ResourceSupport {

	private long authorId;
	private String firstName;
	private String lastName;

	public AuthorResource(Long authorId, String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.authorId = authorId;
	}

	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long id) {
		this.authorId = id;
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
