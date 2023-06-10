package com.bookauthor.demo.bookAuthorRepo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.bookauthor.demo.entity.Author;


public interface AuthorRepo extends JpaRepository <Author , Integer> {



}
