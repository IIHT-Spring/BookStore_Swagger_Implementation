package com.spring.swagger.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.swagger.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

	

}
