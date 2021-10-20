package lk.abccompany.dto;

import lk.abccompany.entity.Admin;
import lk.abccompany.entity.Category;
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
public class Product_dto {

    private String proID;
    private String name;
    private double price;
    private String description;
    private Admin admin;
    private Category category;

}
