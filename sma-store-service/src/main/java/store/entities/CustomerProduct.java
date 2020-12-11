package store.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "smaCustomerProduct")
public class CustomerProduct {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Long customerId;
    @Column(nullable = false)
    private Long productId;
    private String productType;
    private String picture;
    private int boughtQuantity;
    private int reservedQuantity;
    private String title;

}
