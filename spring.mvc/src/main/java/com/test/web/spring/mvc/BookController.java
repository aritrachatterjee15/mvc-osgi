package com.test.web.spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.web.common.AbstractController;
import com.test.web.common.ResourceNotFoundException;
import com.test.web.jpa.client.BookInventory;
import com.test.web.jpa.model.Book;

/**
 * @author AritraChatterjee
 * 
 */
@Controller
@RequestMapping(value = "/")
public class BookController extends AbstractController {

	@Autowired
	private BookInventory bookInventory;
	@Autowired
	private BookResourceAssembler bookResourceAssembler;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<BookResource> viewBooks() {
		return bookResourceAssembler.toResources(bookInventory.viewBooks());
	}

	@RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
	@ResponseBody
	public BookResource getBook(@PathVariable("bookId") long bookId) {
		return bookResourceAssembler.toResource(findBookAndValidate(bookId));
	}

	private Book findBookAndValidate(long bookId) {
		try {
			Book book = bookInventory.findBook(bookId);
			return book;
		} catch (Exception e) {
			throw new ResourceNotFoundException("ID: "
					+ bookId);
		}

	}
}
