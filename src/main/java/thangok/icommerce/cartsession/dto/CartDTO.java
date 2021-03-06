package thangok.icommerce.cartsession.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CartDTO implements Serializable {

    private UUID id;

    private UUID userId;

    private List<CartProductDTO> productList;

}
