package store.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="smaStoreCustomer")
public class StoreCustomer {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Long storeId;
    @Column(nullable = false)
    private Long customerId;
}
