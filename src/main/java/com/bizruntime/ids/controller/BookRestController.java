package com.bizruntime.ids.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizruntime.ids.service.BookRestService;

@RestController
@RequestMapping(value = "/hello", produces = "text/plain")
@CrossOrigin
public class BookRestController {

	@Autowired
	private BookRestService bookRestService;

	public BookRestController() {

	}

	@GetMapping("/{id}")
	public String getMessage() {
		return bookRestService.getMessage();
	}

}
