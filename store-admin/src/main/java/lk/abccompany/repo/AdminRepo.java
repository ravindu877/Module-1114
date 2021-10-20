package lk.abccompany.repo;

import lk.abccompany.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/18/2021
 **/
public interface AdminRepo extends JpaRepository<Admin, String> {
}
