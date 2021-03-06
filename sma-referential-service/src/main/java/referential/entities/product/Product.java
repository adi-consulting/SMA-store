package referential.entities.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Product {
    @Id
    @GeneratedValue
    protected Long id;

    @Column(nullable = false)
    protected String productType;
    
    protected String code;

    protected String picture;

    protected Double priceDutyFree;

    protected Double tax;

    protected Double priceAllTaxIncluded;

    protected Date beginDate;

    protected Date endDate;

    protected String comment;

    protected String status; //VENDU, LOUER ...

    protected String title;
}
