package com.test.web.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import ch.qos.cal10n.IMessageConveyor;

import com.test.web.localization.ExceptionMessage;

/**
 * @author AritraChatterjee
 * 
 */
@RequestMapping(consumes = "application/json", produces = "application/json")
public abstract class AbstractController {

	@Autowired
	private IMessageConveyor messageConveyor;

	@ExceptionHandler
	@ResponseBody
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public Error handleException(RuntimeException e) {
		return new Error(messageConveyor.getMessage(ExceptionMessage.RUNTIME_ERROR,
				e.getLocalizedMessage()));
	}

	/*
	 * @ExceptionHandler
	 * 
	 * @ResponseBody
	 * 
	 * @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) public Error
	 * handleException(RuntimeException e) { return new Error(e.getMessage()); }
	 */

	@ExceptionHandler
	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Error handleException(ResourceNotFoundException e) {
		return new Error(e.getMessage());
	}

	public static class Error {
		private final String error;

		public Error(String error) {
			this.error = error;
		}

		public String getError() {
			return error;
		}
	}
}
