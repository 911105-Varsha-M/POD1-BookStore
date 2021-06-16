package com.POD1.OnlineBookStore.repository;

/**
 * 
 */
import java.util.List;

import com.POD1.OnlineBookStore.entity.Users;
import com.POD1.OnlineBookStore.request.PasswordUpdate;

/**
 * @author HP
 *
 */
public interface IUserRepository {
	Users save(Users users);

	Users getUser(String email);

	boolean verify(Long id);

	boolean upDate(PasswordUpdate information, Long token);

	Users getUserById(Long id );

	List<Users> getUsers();

}

