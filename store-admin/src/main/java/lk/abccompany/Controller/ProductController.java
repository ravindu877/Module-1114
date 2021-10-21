package lk.abccompany.Controller;

import lk.abccompany.dto.Product_dto;
import lk.abccompany.exception.NotFoundException;
import lk.abccompany.service.ProductService;
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
@RequestMapping("V1/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveProduct(@RequestBody Product_dto product_dto){
        if (product_dto.getProID().trim().length()<=0){
            throw new NotFoundException("Product ID is empty");
        }
        System.out.println(product_dto);
        productService.addProduct(product_dto);
        return new ResponseEntity(new StandardResponse("201","done",product_dto),HttpStatus.CREATED);

    }
}
