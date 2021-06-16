package com.POD1.OnlineBookStore.service;

/**
 * 
 */
import java.util.List;

import com.POD1.OnlineBookStore.dto.UserDto;
import com.POD1.OnlineBookStore.entity.Users;
import com.POD1.OnlineBookStore.request.LoginInformation;
import com.POD1.OnlineBookStore.request.PasswordUpdate;

/**
 * @author HP
 *
 */
public interface UserServices {

	Users login(LoginInformation information);
	boolean register(UserDto ionformation);
	boolean verify(String token) throws Exception;
	boolean isUserExist(String email);
	boolean update(PasswordUpdate information, String token);
	List<Users> getUsers();
	Users getSingleUser(String token);
}
