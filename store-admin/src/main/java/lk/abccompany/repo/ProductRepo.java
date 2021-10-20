package lk.abccompany.repo;

import lk.abccompany.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/18/2021
 **/
public interface ProductRepo extends JpaRepository<Product, String> {
}
