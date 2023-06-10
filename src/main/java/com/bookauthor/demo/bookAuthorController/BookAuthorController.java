package com.bookauthor.demo.bookAuthorController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookauthor.demo.bookAuthorService.BookAuthorService;
import com.bookauthor.demo.entity.Author;


@RestController
@RequestMapping("bookauthor")
public class BookAuthorController {
	
	@Autowired
	 private BookAuthorService bookAuthorService;
	
	@PostMapping("/post")
	public Author saveauthor(@RequestBody Author request) {
	return bookAuthorService.saveAuthor(request);

}
	@GetMapping("/get")
	public List <Author> getAuthor(){
		return bookAuthorService.getAllAuthor();
	}
	@PutMapping("/update/{id}")
	public Author updateAuthor(@RequestBody Author request ) {
		return bookAuthorService.updateAuthor(request);
	}
	@GetMapping("/getid/{id}")
	public ResponseEntity <Author> getByAuthorId(@PathVariable Integer id){
		Author author = bookAuthorService.getByAuhorId(id);
		if (author != null) {
			return ResponseEntity.ok(author);
        } else {
            return ResponseEntity.notFound().build();
        }
	}
		@PutMapping("/inactive/{id}")
		public String inactiveId(@PathVariable ("id") int id) {
			return bookAuthorService.inactiveId(id);
			
		}
	@GetMapping ("/active")
	public List <Author> getActiveAuthor(){
		return bookAuthorService.getActiveAllAuthor();
	}
	@GetMapping ("/inactive")	
	public List <Author> inActiveAuthor(){
		return bookAuthorService.getAllInActiveAuthor();
	}
	@GetMapping("/Authorbooks")
	public List <Author> AuthorBooks(){
		return bookAuthorService.getAuthorBooks();
	}
}


	