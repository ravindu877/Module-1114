package lk.abccompany.repo;

import lk.abccompany.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/18/2021
 **/
public interface UserRepo extends JpaRepository<User, String> {
}
