package com.test.web.jpa.client.tests;

import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.ServiceReference;

import com.test.web.jpa.client.AuthorOperations;
import com.test.web.jpa.client.BookInventory;

/**
 * @author AritraChatterjee
 * 
 */
public class TestJpaClient {

	private BookInventory bookInventory;
	private AuthorOperations authorOperations;

	@Before
	public void setUp() throws InterruptedException {
		
		Thread.sleep(5000);

		ServiceReference<BookInventory> analysisRef = Activator.getContext()
				.getServiceReference(BookInventory.class);
		bookInventory = Activator.getContext().getService(analysisRef);

		ServiceReference<AuthorOperations> authorRef = Activator.getContext()
				.getServiceReference(AuthorOperations.class);
		authorOperations = Activator.getContext().getService(authorRef);

	}

	@Test
	public void testAddAuthor() {
		authorOperations.addAuthor("George R R", "Martin");
	}

	@Test
	public void testAddBook() {
		authorOperations.addAuthor("George R R", "Martin");
		bookInventory.addBook("A Song of Ice and Fire", "Martin");
	}
}
