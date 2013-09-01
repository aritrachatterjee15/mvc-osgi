package com.test.web.spring.mvc.config;

import javax.servlet.ServletContext;

import org.osgi.framework.BundleContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.test.web.jpa.client.AuthorOperations;
import com.test.web.spring.mvc.another.AuthorResourceAssembler;

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

	@Autowired
	private AuthorResourceAssembler authorResourceAssembler;

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	@Bean
	public AuthorOperations authorOperations() throws InterruptedException {
		BundleContext bundleContext = (BundleContext) servletContext
				.getAttribute("osgi-bundlecontext");
		if (bundleContext == null) {
			throw new IllegalStateException("osgi-bundlecontext not registered");
		}
		return bundleContext.getService(bundleContext
				.getServiceReference(AuthorOperations.class));
	}
}
