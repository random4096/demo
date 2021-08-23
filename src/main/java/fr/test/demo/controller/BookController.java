package fr.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.test.demo.model.Book;

@Controller
public class BookController {

	@GetMapping("/")
	public @ResponseBody Book greeting() {
		return new Book();
	}

}