package com.test.web.jpa.client.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.ServiceReference;

import com.test.web.jpa.client.BookInventory;

/**
 * @author AritraChatterjee
 * 
 */
public class TestJpaClient {

	private BookInventory bookInventory;

	@Before
	public void setUp() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			Assert.fail(e.getMessage());
		}

		ServiceReference<BookInventory> analysisRef = Activator.getContext()
				.getServiceReference(BookInventory.class);
		bookInventory = Activator.getContext().getService(analysisRef);
	}

	@Test
	public void testAddAuthor() {
		bookInventory.addAuthor("Test", "User");
	}
}
