package org.academiadecodigo.bootcamp.bigproject;

/**
 * Created by codecadet on 22/06/17.
 */
public interface UserService {

    boolean authenticate(String name, String password);

    void addUser(User user);

    User findByName(String name);

    int count();
}
