package referential.entities.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import referential.model.ProductStatus;
import referential.model.ProductType;

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
    @Enumerated(EnumType.STRING)
    protected ProductType productType;
    
    protected String code;

    protected String picture;

    protected Double priceDutyFree;

    protected Double tax;

    protected Double priceAllTaxIncluded;

    protected Date beginDate;

    protected Date endDate;

    protected String comment;

    @Enumerated(EnumType.STRING)
    protected ProductStatus status; //VENDU, LOUER ...

    protected String title;


}
