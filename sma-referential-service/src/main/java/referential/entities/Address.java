package referential.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "smaAddress")
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String type;//customer, manager, shop

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String City;

    @Column(nullable = false)
    private Integer postBox;

    @Column(nullable = false)
    private String addressLine1;

    private String addressLine2;
}
