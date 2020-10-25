package store.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sma_Store")
public class StoreCustomer {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "store_id")
    private Long storeId;

    @Column(name = "customer_id")
    private Long customertId;
}
