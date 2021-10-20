package lk.abccompany.Controller;

import lk.abccompany.dto.User_dto;
import lk.abccompany.exception.NotFoundException;
import lk.abccompany.service.UserService;
import lk.abccompany.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/18/2021
 **/


@RestController
@RequestMapping("V1/user")
@CrossOrigin
public class UserController {

   @Autowired
    private UserService userService;


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveUser(@RequestBody User_dto user_dto){
        if (user_dto.getUserID().trim().length()<=0){
            throw new NotFoundException("UserID is empty");
        }
        System.out.println(user_dto.getUserID());
        userService.addUser(user_dto);
        return new ResponseEntity(new StandardResponse("201","done",user_dto),HttpStatus.CREATED);
    }

}
