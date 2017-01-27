package com.sf.unittest.service;

/**
 * Created by cyprian on 1/26/17.
 */

import com.sf.unittest.model.User;

import java.util.List;

/**
 * This is used
 */
public interface UserService {

    /**
     * Adds a new @{@link User}
     * @param user that has to be added
     * @return the {@link List} of @{@link User} that has been added
     */
    List<User> addUser(User  user);

    /**
     * Find a user by @{@link Long} id
     * @param id to find the @{@link User} with
     * @return @{@link User} found
     */
    User findById(Long id);

    /**
     * Find {@link List} of users
     * @return @{@link List} of @{@link User}
     */
    List<User> findAll();

    /**
     * Delete a @{@link User}
     * @param @{@link User} to be deleted
     */
    void deleteUser(User user);
}
