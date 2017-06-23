package org.academiadecodigo.bootcamp.bigproject;

import java.util.LinkedList;

/**
 * Created by codecadet on 22/06/17.
 */
public class MockUserService implements UserService {

    private LinkedList<User> users;
    private int count = 0;

    public MockUserService() {
        users = new LinkedList<>();
    }

    @Override
    public boolean authenticate(String name, String password) {
        if (name.equals("Fiono") && password.equals("123")) {
            System.out.println("Authentication succeed!");
            return true;
        }
        System.out.println("Sorry, bro!");
        return false;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
        count();
    }

    @Override
    public User findByName(String name) {
        for (User user : users) {
            if (user.getUsername().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public int count() {
        return count++;
    }
}
