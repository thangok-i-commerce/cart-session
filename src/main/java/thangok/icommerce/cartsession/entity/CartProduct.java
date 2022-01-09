package thangok.icommerce.cartsession.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "cart_product")
@Getter
@Setter
@NoArgsConstructor
public class CartProduct implements Serializable {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "cart_id", nullable = false)
    private Cart cart;

    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "count")
    private Long count;

}
