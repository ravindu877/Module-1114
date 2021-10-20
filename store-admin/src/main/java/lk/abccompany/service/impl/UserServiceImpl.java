package lk.abccompany.service.impl;

import lk.abccompany.dto.User_dto;
import lk.abccompany.entity.User;
import lk.abccompany.exception.ValidateException;
import lk.abccompany.repo.UserRepo;
import lk.abccompany.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/19/2021
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void addUser(User_dto dto) {
        if (userRepo.existsById(dto.getUserID())){
            throw new ValidateException("Car already exist");
        }
        userRepo.save(modelMapper.map(dto,User.class));
    }

    @Override
    public void deleteUser(String id) {

    }

    @Override
    public void updateUser(User_dto dto) {

    }

    @Override
    public User_dto searchUser(String id) {
        return null;
    }

    @Override
    public ArrayList<User_dto> getAllUsers() {
        return null;
    }
}
