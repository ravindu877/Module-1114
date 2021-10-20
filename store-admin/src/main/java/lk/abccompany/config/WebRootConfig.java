package lk.abccompany.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/18/2021
 **/

@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
}
