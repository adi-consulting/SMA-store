package store.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="smaStore")
public class StoreCustomer {
    @Id
    @GeneratedValue
    private Long id;
    private Long storeId;
    private Long customertId;
}
