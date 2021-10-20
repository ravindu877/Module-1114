package lk.abccompany.exception;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/18/2021
 **/
public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

}
