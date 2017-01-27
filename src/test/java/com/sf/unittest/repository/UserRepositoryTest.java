package com.sf.unittest.repository;

import com.sf.unittest.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by cyprian on 1/26/17.
 */
public class UserRepositoryTest {

    private final Long ID = 1L;
    private final String FIRST_NAME = "AAAAA";
    private final String LAST_NAME = "BBBBB";
    private final int AGE = 12;

    private final Long NEW_ID = 1L;
    private final String NEW_FIRST_NAME = "CCCCC";
    private final String NEW_LAST_NAME = "DDDDD";
    private final int NEW_AGE = 14;

    private final int SIZE  = 1;

    private UserRepository userRepository;
    private User user;
    private ArrayList<User> userList = new ArrayList<>();

    @Before
    public void setUp(){
//        userRepository = Mockito.mock(UserRepository.class);
        userRepository = new UserRepository();
        user = new User();
        user.setAge(AGE);
        user.setFirstName(FIRST_NAME);
        user.setLastName(LAST_NAME);
        user.setId(ID);

        userList.add(user);
//        Mockito.when(userRepository.save(user)).thenReturn(userList);
//        Mockito.when(userRepository.findById(ID)).thenReturn(user);
//        Mockito.when(userRepository.findAllUsers()).thenReturn(userList);
//        Mockito.when(userRepository.findAllUsers()).thenReturn(userList);

    }

    @Test
    public void save() throws Exception {
        User newUser = new User();
        newUser.setLastName(NEW_LAST_NAME);
        newUser.setFirstName(NEW_FIRST_NAME);
        newUser.setId(NEW_ID);
        newUser.setAge(NEW_AGE);
        List<User> userList = userRepository.save(newUser);
        Assert.assertNotNull(userList);
        Assert.assertEquals(userList.size(),SIZE);

        User userById = userRepository.findById(NEW_ID);
        Assert.assertEquals(userById.getAge(),NEW_AGE);
        Assert.assertEquals(userById.getFirstName(),NEW_FIRST_NAME);
    }

    @Test
    public void findById() throws Exception {
        User userById = userRepository.findById(ID);
        Assert.assertEquals(userById.getAge(),user.getAge());
        Assert.assertEquals(userById.getFirstName(),user.getFirstName());
    }

    @Test
    public void findAllUsers() throws Exception {

    }
//
//    @Test
//    public void remove() throws Exception {
//
//    }

}