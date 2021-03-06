package store.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String type;//customer, manager, shop

    private String country;

    private String City;

    private Integer postBox;

    private String addressLine1;

    private String addressLine2;

}
