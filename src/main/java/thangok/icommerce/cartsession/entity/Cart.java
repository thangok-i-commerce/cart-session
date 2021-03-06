package thangok.icommerce.cartsession.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Cart")
@Getter
@Setter
@NoArgsConstructor
public class Cart implements Serializable {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @OneToMany(mappedBy = "cart")
    private List<CartProduct> productList;
}
