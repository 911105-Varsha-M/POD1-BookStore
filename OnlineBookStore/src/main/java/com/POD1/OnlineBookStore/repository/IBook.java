package com.POD1.OnlineBookStore.repository;

import java.util.List;

import com.POD1.OnlineBookStore.entity.Book;

public interface IBook {

	Book save(Book bookinformation);

	List<Book> getUsers();

}

