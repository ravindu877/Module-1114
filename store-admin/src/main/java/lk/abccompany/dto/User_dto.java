package lk.abccompany.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/18/2021
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User_dto {

    private String userID;
    private String email;
    private String userName;
    private String password;

}
