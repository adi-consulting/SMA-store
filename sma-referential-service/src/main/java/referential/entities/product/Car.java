package referential.entities.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("car")
@PrimaryKeyJoinColumn(name = "id_product")
public class Car extends Product{
    private String brand;

    private String model;

    private String puissance;

    private String energy;

    private String color;

    //  @Column( nullable=true)
    //  private double kilometer;

    private String gearbox;

    @Column(name = "kind_Of_Car")
    private String kindOfCar;

    private String feature;

    @Column(name = "manufactured_Date")
    private Date manufacturedDate;

    @Column(name = "registration_Date")
    private Date registrationDate;

    private String registration;
}
