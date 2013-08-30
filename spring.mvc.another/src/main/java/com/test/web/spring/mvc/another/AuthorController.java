package com.test.web.spring.mvc.another;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.web.jpa.client.AuthorOperations;
import com.test.web.jpa.model.Author;

/**
 * @author AritraChatterjee
 * 
 */
@Controller
public class AuthorController {

	@Autowired
	private AuthorOperations authorOperations;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	@ResponseBody
	public List<Author> viewAuthors() {
		return authorOperations.viewAuthors();
	}
}
