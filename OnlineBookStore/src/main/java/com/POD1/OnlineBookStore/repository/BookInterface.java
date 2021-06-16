package com.POD1.OnlineBookStore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.POD1.OnlineBookStore.entity.Book;

public interface BookInterface extends CrudRepository<Book, Long>{
	
	List<Book> findByStatus(String status);
	
	Book findByBookId(Long bookId);

}
