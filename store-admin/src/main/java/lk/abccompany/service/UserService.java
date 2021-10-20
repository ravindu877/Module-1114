package lk.abccompany.service;

import lk.abccompany.dto.User_dto;

import java.util.ArrayList;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/19/2021
 **/
public interface UserService {

    void addUser(User_dto dto);

    void deleteUser(String id);

    void updateUser(User_dto dto);

    User_dto searchUser(String id);

    ArrayList<User_dto> getAllUsers();
}
