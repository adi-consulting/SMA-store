package store.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sma_store_product")
public class StoreProduct {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "store_id")
    private Long storeId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_type")
    private String productType;

    private String picture;

    @Column(name = "initial_quantity")
    private int initialQuantity;

    @Column(name = "sold_quantity")
    private int soldQuantity;

    @Column(name = "reserved_quantity")
    private int reservedQuantity;

    private String title;
}
