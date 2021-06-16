package com.POD1.OnlineBookStore.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.POD1.OnlineBookStore.entity.Book;
import com.POD1.OnlineBookStore.entity.Users;
import com.POD1.OnlineBookStore.exception.AdminNotFoundException;
import com.POD1.OnlineBookStore.exception.BookNotFoundException;
import com.POD1.OnlineBookStore.repository.BookImple;
import com.POD1.OnlineBookStore.repository.BookInterface;
import com.POD1.OnlineBookStore.repository.CustomerRepository;
import com.POD1.OnlineBookStore.service.IAdminService;
import com.POD1.OnlineBookStore.util.JwtGenerator;

@Service
public class AdminServiceImpl implements IAdminService {

//	@Autowired
//	private IOrderStatusRepository orderStatusRepo;
//
	@Autowired
	CustomerRepository userRepo;

	@Autowired
	JwtGenerator jwt;

	@Autowired
	private BookImple bookRepository;
	
	@Autowired
	BookInterface bookRepo;

	@Override
	public boolean verifyBook(long bookId,String staus, String token) {

		long userid = 0;
		Users user = null;
			userid = jwt.parseJWT(token);
			System.out.println("user id:" + userid);
			user = userRepo.getCustomerDetailsbyId(userid);
			System.out.println("user:" + user);
	
		if (user != null) {
			Book book = bookRepo.findByBookId(bookId);
			System.out.println("bookinfo "+book);
			
			if (book != null) {
				book.setStatus(staus);

				bookRepo.save(book);
				return true;
				
			} else {
				throw new BookNotFoundException("Book Not Found");
			}

		} else {
			throw new AdminNotFoundException("Admin Not Found");
		}
	}

		@Override
	public List<Book> getBooksByStatus(String status) {
		
		return bookRepo.findByStatus(status);
	}

	


}
