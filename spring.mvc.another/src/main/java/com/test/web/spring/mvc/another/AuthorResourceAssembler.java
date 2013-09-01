package com.test.web.spring.mvc.another;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import com.test.web.jpa.model.Author;

/**
 * @author AritraChatterjee
 * 
 */
@Component
public class AuthorResourceAssembler extends
		ResourceAssemblerSupport<Author, AuthorResource> {

	public AuthorResourceAssembler() {
		super(AuthorController.class, AuthorResource.class);
	}

	@Override
	public AuthorResource toResource(Author author) {
		AuthorResource authorResource = createResourceWithId(author.getId(),
				author);
		authorResource.setAuthorId(author.getId());
		authorResource.setFirstName(author.getFirstName());
		authorResource.setLastName(author.getLastName());
		return authorResource;
	}

	@Override
	protected AuthorResource instantiateResource(Author author) {
		return new AuthorResource(author.getId(), author.getFirstName(),
				author.getLastName());
	}

}
