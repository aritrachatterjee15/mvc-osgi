package com.test.web.spring.mvc.another;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.web.jpa.client.BookInventory;
import com.test.web.jpa.model.Book;

/**
 * @author AritraChatterjee
 * 
 */
@Controller
@RequestMapping(value = "/test")
public class BookController {

	@Autowired
	private BookInventory bookInventory;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	@ResponseBody
	public List<Book> viewBooks() {
		return bookInventory.viewBooks();
	}
}
