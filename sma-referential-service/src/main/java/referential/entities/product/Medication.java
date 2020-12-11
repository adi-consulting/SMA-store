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
public class Medication extends  Product{
    private String name;
    private String laboratory;

    @Column(name = "prescription_Only")
    private boolean prescriptionOnly;

    @Column(name = "expiration_Date")
    private Date expirationDate;

    @Column(name = "manufactured_Date")
    private String manufacturedDate;

}
