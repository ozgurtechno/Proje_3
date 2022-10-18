package service;

import entity.Item;
import entity.User;
import exception.ItemNotFoundException;
import exception.UserNotFoundException;

import java.util.List;
import java.util.Scanner;

public interface UserService {

    // TODO Bu class a dokunmayiniz....OOP Abstraction
    List<User> getAllUser();

    User getUserById(int id) throws UserNotFoundException;

    User addUser();

    void deleteUserById(int id) throws UserNotFoundException;

    void updateUser(User user);

    // TODO Bu class a dokunmayiniz....OOP Abstraction
}
