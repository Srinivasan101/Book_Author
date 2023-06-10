package com.bookauthor.demo.bookAuthorController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookauthor.demo.bookAuthorService.AuthorBookService;
import com.bookauthor.demo.entity.Book;

@RestController
@RequestMapping("/authorbook")
public class AuthorBookController {
	
	@Autowired
	private AuthorBookService authorBookService;
	
}