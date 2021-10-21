package lk.abccompany.service.impl;

import lk.abccompany.dto.Product_dto;
import lk.abccompany.entity.Product;
import lk.abccompany.entity.User;
import lk.abccompany.exception.ValidateException;
import lk.abccompany.repo.ProductRepo;
import lk.abccompany.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/20/2021
 **/

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public void addProduct(Product_dto dto) {
        if (productRepo.existsById(dto.getProID())){
            throw new ValidateException("Car already exist");
        }
        System.out.println(modelMapper.map(dto,Product.class));
        productRepo.save(modelMapper.map(dto,Product.class));
    }
}
