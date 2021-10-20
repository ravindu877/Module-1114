package lk.abccompany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/18/2021
 **/

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    private String userID;
    private String email;
    private String userName;
    private String password;


}
