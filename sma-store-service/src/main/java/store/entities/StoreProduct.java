package store.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "smaStoreProduct")
public class StoreProduct {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Long storeId;
    @Column(nullable = false)
    private Long productId;
    private String productType;
    private String picture;
    private int initialQuantity;
    private int soldQuantity;
    private int reservedQuantity;
    private String title;
}
