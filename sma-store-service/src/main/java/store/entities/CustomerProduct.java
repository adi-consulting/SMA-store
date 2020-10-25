package store.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sma_customer_product")
public class CustomerProduct {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_type")
    private String productType;

    private String picture;

    @Column(name = "bought_quantity")
    private int boughtQuantity;

    @Column(name = "reserved_quantity")
    private int reservedQuantity;

    private String title;

}
