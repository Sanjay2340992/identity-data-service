package com.bizruntime.ids.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello", produces = "text/plain")
@CrossOrigin
public class BookRestController {

	@GetMapping("/{id}")
	public String getMessage() {
		return "Hello World!!";
	}

}
