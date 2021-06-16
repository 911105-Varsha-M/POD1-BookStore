package com.POD1.OnlineBookStore.service;

import java.util.List;

import com.POD1.OnlineBookStore.entity.Book;

public interface IAdminService {
	

	boolean verifyBook(long bookId, String staus, String token);


	List<Book> getBooksByStatus(String status);


}
