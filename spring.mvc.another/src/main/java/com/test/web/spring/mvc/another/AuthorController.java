package com.test.web.spring.mvc.another;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.web.common.AbstractController;
import com.test.web.common.ResourceNotFoundException;
import com.test.web.jpa.client.AuthorOperations;
import com.test.web.jpa.model.Author;

/**
 * @author AritraChatterjee
 * 
 */
@Controller
@RequestMapping(value = "/")
public class AuthorController extends AbstractController {

	@Autowired
	private AuthorOperations authorOperations;
	@Autowired
	private AuthorResourceAssembler authorResourceAssembler;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<AuthorResource> viewAuthors() {
		return authorResourceAssembler.toResources(authorOperations
				.viewAuthors());
	}

	@RequestMapping(value = "/{authorId}", method = RequestMethod.GET)
	@ResponseBody
	public AuthorResource getAuthor(@PathVariable("authorId") long authorId) {
		return authorResourceAssembler
				.toResource(findAuthorAndValidate(authorId));
	}

	private Author findAuthorAndValidate(long authorId) {
		try {
			Author author = authorOperations.findAuthor(authorId);
			return author;
		} catch (Exception e) {
			throw new ResourceNotFoundException(
					"Unbale to find author with ID: " + authorId);
		}

	}
}
