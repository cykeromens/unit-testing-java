package com.sf.unittest.repository;

import com.sf.unittest.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cyprian on 1/26/17.
 *
 * We shall not be working with a database of whats so ever we will have all our data managed here
 *
 * This will be our repository
 */
public class UserRepository {

    private ArrayList<User> users;

    public UserRepository(){
        users = new ArrayList<>();
    }

    /**
     * Save new User
     * @param user
     */
    public List<User> save(User user){
        users.add(user);
        return users;
    }

    /**
     * Find user
     * @param id
     */
    public User findById(Long id){
        final User[] user = {null};
        users.stream().forEachOrdered(u -> {
            if(u.getId().equals(id)){
                user[0] = u;
            }
        });
        return user[0];
    }

    /**
     * Returns all users added
     * @return
     */
    public List<User> findAllUsers(){
        return users;
    }

    /**
     * Remove a user from the list
     * @param user
     */
    public void remove(User user){
        users.remove(user);
    }


}
