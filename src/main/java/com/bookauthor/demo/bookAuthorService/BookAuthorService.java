package com.bookauthor.demo.bookAuthorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookauthor.demo.bookAuthorRepo.AuthorRepo;
import com.bookauthor.demo.entity.Author;

@Service
public class BookAuthorService {
	@Autowired
	private AuthorRepo authorRepo;

	public Author saveAuthor(Author request) {
		return authorRepo.save(request);
	}

	public List<Author> getAllAuthor() {
		return authorRepo.findAll();
	}

	public Author updateAuthor(Author request) {
		return authorRepo.save(request);
	}

	public Author getByAuhorId(Integer id) {
		Optional<Author> authorOptional = authorRepo.findById(id);
		if (authorOptional.isPresent() && authorOptional.get() instanceof Author) {
			return (Author) authorOptional.get();
		} else {
			return null;
		}

	}

	public String inactiveId(int id) {
		Author author = authorRepo.findById(id).get();
		author.setStatus("Inactive");
		authorRepo.save(author);
		return "Successfully inactivated";
	}

	public List<Author> getActiveAllAuthor() {
		List<Author> author = authorRepo.findAll();
		List<Author> authorList = new ArrayList<>();
		for (Author i : author) {
			if (i.getStatus().equalsIgnoreCase("Active"))
				authorList.add(i);
		}
		return authorList;

	}

	public List<Author> getAllInActiveAuthor() {
	List <Author> author = authorRepo.findAll();
	List <Author> authorList = new ArrayList <>();
	for (Author s : author) {
		if (s.getStatus().equalsIgnoreCase("inActive"))
		authorList.add(s);
		
	}
		return authorList;
	}

	public List<Author> getAuthorBooks() {
		List <Author> author = authorRepo.findAll();
		List <Author> authorList = new ArrayList<>();
		for(Author m : author) {
			if (m.getBooks().size() < 5)
			authorList.add(m);
		}
		return authorList;
	}
}
