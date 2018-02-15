package ua.online.courses.service;

import java.util.List;

import ua.online.courses.entity.User;

public interface UserService {

	void saveUser(User user);
	
	User findById(int id);
	
	List<User> findAllUsers();
	
}
