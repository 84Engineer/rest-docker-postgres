package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author olysenko
 */
@RestController
@RequestMapping(path = "/book")
public class BookController {
   private final BookService bookService;

   @Autowired
   public BookController(BookService bookService) {
      this.bookService = bookService;
   }

   @GetMapping("/data")
   public ResponseEntity onResRequest(@RequestParam(value = "id") String id) {
      Long Id = Long.parseLong(id);
      return ResponseEntity.ok(bookService.getBookStats(Id));
   }
}