package lk.abccompany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/18/2021
 **/

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
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

    @ManyToOne
    @JoinColumn(name = "adminID", referencedColumnName = "adminID")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "categoryID", referencedColumnName = "categoryID")
    private Category category;


}
