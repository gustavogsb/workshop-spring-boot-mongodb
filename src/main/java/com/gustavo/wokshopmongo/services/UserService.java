package com.gustavo.wokshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.wokshopmongo.domain.User;
import com.gustavo.wokshopmongo.repository.UserRepository;

@Service
public class UserService {
	
		@Autowired
		private UserRepository repo;

		public List<User> findAll(){
			return repo.findAll();
		}
}
