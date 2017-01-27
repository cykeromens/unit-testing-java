package com.sf.unittest;

import com.sf.unittest.repository.UserRepository;
import com.sf.unittest.service.UserService;
import com.sf.unittest.service.impl.UserServiceImpl;

/**
 * Created by cyprian on 1/26/17.
 *
 *
 *  A very basic program that demonstrates the use of JUnit tests. The tests include a sample unit test and an
 * integration test.
 */
public class UnitTestApp {

    /**
     * The main method of this program.
     *
     * @param args Arguments passed to this program.
     */
    public static void main(String[] args) {

        //Create a new user repository
        UserRepository userRepository = new UserRepository();

        //Create a new user service object
        UserService userService =  new UserServiceImpl(userRepository);



    }
}
