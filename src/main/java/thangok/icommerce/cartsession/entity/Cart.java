package thangok.icommerce.cartsession.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "cart")
@Getter
@Setter
@NoArgsConstructor
public class Cart implements Serializable {

    @Id
    private String cartCode;

    @Column(name = "cart_name")
    private String cartName;

    @Column(name = "description")
    private String description;

}
