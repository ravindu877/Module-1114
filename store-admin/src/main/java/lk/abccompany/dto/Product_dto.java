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
    private String code;
    private String name;
    private String price;
    private String specification;
    private String description;
    private String dimensions;
    private String warranty;
    private String mainView;
    private String view1;
    private String view2;
    private String view3;
    private Admin_dto admin;
    private Category_dto category;

}
