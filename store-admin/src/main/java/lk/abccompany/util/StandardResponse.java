package lk.abccompany.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ravindu Lakshan <ravindulakshan877@gmail.com>
 * @since 10/18/2021
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StandardResponse {

    private String code;
    private String message;
    private Object data;

}
