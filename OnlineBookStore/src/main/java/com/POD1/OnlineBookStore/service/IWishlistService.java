package com.POD1.OnlineBookStore.service;

import java.util.List;

import com.POD1.OnlineBookStore.entity.WishlistBook;

public interface IWishlistService {
	List<WishlistBook> addwishBook(String token,long bookId);
	
	List<WishlistBook> getWishlistBooks(String token);
	
	boolean removeWishBook(String token, Long bookId);
	
	int getCountOfWishlist(String token);

}
