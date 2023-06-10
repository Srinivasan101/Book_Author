package com.bookauthor.demo.bookAuthorRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookauthor.demo.entity.Book;

public interface BookRepo extends JpaRepository <Book , Integer> {

}
