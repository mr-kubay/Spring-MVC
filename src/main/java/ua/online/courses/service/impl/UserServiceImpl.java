package ua.online.courses.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.online.courses.entity.User;
import ua.online.courses.repository.UserRepository;
import ua.online.courses.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public User findById(int id) {
		return userRepository.findOne(id);
	}

	@Override
	public List<User> findAllUsers() {
		
		return userRepository.findAll();
	}
	
}
