package com.sutaruhin.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sutaruhin.entity.User;
import com.sutaruhin.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public List<User> getUserList() {

        return userRepository.findAll();
    }

    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public void deleteUser(Set<Integer> idck) {
    	for(Integer id: idck) {
    		userRepository.deleteById(id);
    	}
    }
}
