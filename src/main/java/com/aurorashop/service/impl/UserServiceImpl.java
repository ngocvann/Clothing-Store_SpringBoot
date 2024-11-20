package com.aurorashop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurorashop.model.UserDtls;
import com.aurorashop.repository.UserRepository;
import com.aurorashop.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDtls saveUser(UserDtls user) {
		UserDtls saveUser = userRepository.save(user);
		return saveUser;
	}

}
