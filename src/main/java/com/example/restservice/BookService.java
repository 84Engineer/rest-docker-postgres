package com.example.restservice;

import com.example.entities.BookEntity;
import com.example.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author olysenko
 */
@Service
//@Transactional
public class BookService {

   private static final Logger log = LoggerFactory.getLogger(BookService.class);

   private BookRepository bookRepository;

   @Autowired
   public BookService(BookRepository bookRepository) {
      this.bookRepository = bookRepository;
   }

   public String getBookStats(Long id) {
      BookEntity book = bookRepository.findById(id);

      if (book == null) {
         log.error("Book with id " + id + " not found.");
         return null;
      }

      String result = "{ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + " }";

      log.info("Entity found: " + result);

      return result;
   }
}
