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
@Table(name="smaStore")
public class Store {

    @Id
    @GeneratedValue
    private Long id;
    private Long groupId;
    private String code;
    @Column(nullable = false)
    private String shopName;
    private Long idAddress;
    private Boolean active;

    @Transient
    private List<Manager> managers;

    @Transient
    private List<Customer> customers;


}
