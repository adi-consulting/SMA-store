package store.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sma_store_manager")
public class StoreManager {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "store_id")
    private Long storeId;

    @Column(name = "manager_id")
    private Long managerId;
}
