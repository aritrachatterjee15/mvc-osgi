package com.test.web.spring.mvc;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import com.test.web.jpa.model.Book;

/**
 * @author AritraChatterjee
 * 
 */
@Component
public class BookResourceAssembler extends
		ResourceAssemblerSupport<Book, BookResource> {

	public BookResourceAssembler() {
		super(BookController.class, BookResource.class);
	}

	@Override
	public BookResource toResource(Book book) {
		BookResource bookResource = createResourceWithId(book.getId(), book);
		bookResource.setBookId(book.getId());
		bookResource.setName(book.getName());
		bookResource.setAuthor(book.getAuthor());
		return bookResource;
	}

}
