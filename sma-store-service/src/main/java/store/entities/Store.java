package store.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import store.models.Customer;
import store.models.Manager;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sma_store")
public class Store {

    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String shopName;
    private Long idAddress;

    @Transient
    private List<Manager> managers;

    @Transient
    private List<Customer> customers;


}
