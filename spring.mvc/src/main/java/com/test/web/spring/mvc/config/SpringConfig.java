package com.test.web.spring.mvc.config;

import javax.servlet.ServletContext;

import org.osgi.framework.BundleContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.test.web.jpa.client.BookInventory;

/**
 * @author AritraChatterjee
 * 
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.test.web.spring")
public class SpringConfig extends WebMvcConfigurerAdapter implements
		ServletContextAware {

	private ServletContext servletContext;

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	@Bean
	public BookInventory bookInventory() {
		BundleContext bundleContext = getBundleContext();
		return bundleContext.getService(bundleContext
				.getServiceReference(BookInventory.class));
	}

	private BundleContext getBundleContext() {
		BundleContext bundleContext = (BundleContext) servletContext
				.getAttribute("osgi-bundlecontext");
		if (bundleContext == null) {
			throw new IllegalStateException("osgi-bundlecontext not registered");
		}
		return bundleContext;
	}
}
