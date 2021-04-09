package com.example.mysqldemo.service;

import java.util.List;
import java.util.Optional;

import com.example.mysqldemo.entity.User;

public interface IUserService {
	int save(User user);
	List<User> getUser();

	Optional<User> getUserById(Integer userId);

	void updateUser(User user);

	void deleteOrder(Integer userId);
	List<User> getAllUsers();
}
