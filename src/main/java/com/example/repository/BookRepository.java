package com.example.repository;

import com.example.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author olysenko
 */
@Repository
public interface BookRepository extends JpaRepository<BookEntity, String> {
   BookEntity findById(Long id);
}