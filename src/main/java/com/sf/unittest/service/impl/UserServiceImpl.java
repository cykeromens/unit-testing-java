package com.sf.unittest.service.impl;

import com.sf.unittest.repository.UserRepository;
import com.sf.unittest.service.UserService;
import com.sf.unittest.model.User;

import java.util.List;

/**
 * Created by cyprian on 1/26/17.
 *
 * An implementation for the @{@link UserService}
 *
 */
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        userRepository = new UserRepository();
    }

    @Override
    public List<User> addUser(User user) {
        userRepository.save(user);
        return null;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAllUsers();
    }

    @Override
    public void deleteUser(User user) {
        userRepository.remove(user);
    }

}
