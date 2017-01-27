//package com.sf.unittest.service;
//
//import com.sf.unittest.model.User;
//import com.sf.unittest.repository.UserRepository;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
///**
// * Created by cyprian on 1/26/17.
// */
//public class UserServiceTest {
//
//    private final Long ID = 1L;
//    private final String FIRST_NAME = "AAAAA";
//    private final String LAST_NAME = "BBBBB";
//    private final int AGE = 12;
//
//    private final Long ID2 = 1L;
//    private final String FIRST_NAME2 = "CCCCC";
//    private final String LAST_NAME2 = "DDDDD";
//    private final int AGE2 = 14;
//
//    private final int SIZE  = 1;
//
//    private UserRepository userRepository;
//    private User user;
//
//    @Before
//    public void setUp() throws Exception {
//        userRepository = new UserRepository();
//        user = new User();
//        user.setAge(AGE);
//        user.setFirstName(FIRST_NAME);
//        user.setLastName(LAST_NAME);
//        user.setId(ID);
//    }
//
//    @After
//    public void tearDown() throws Exception {
//
//    }
//
//    @Test
//    public void addUser() throws Exception {
//
//    }
//
//    @Test
//    public void findById() throws Exception {
//
//    }
//
//    @Test
//    public void findAll() throws Exception {
//
//    }
//
//    @Test
//    public void deleteUser() throws Exception {
//
//    }
//
//}