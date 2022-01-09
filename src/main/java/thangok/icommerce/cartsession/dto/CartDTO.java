package thangok.icommerce.cartsession.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class CartDTO implements Serializable {

    private String cartCode;

    private String cartName;
    private String description;

}
