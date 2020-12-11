package referential.entities.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car extends Product{

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    private String power;

    private String energy;

    private String color;

    private double kilometer;

    private String gearbox;

    private String kindOfCar;

    private String feature;

    private Date manufacturedDate;

    private Date registrationDate;

    private String registration;
}
