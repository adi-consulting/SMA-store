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
@DiscriminatorValue("medication")
@PrimaryKeyJoinColumn(name = "id_product")
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
