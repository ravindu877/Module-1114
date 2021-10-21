package lk.abccompany.dto;

import lk.abccompany.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/18/2021
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Admin_dto {

    private String adminID;
    private String userName;
    private String password;


}
