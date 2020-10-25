package referential.entities.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED.JOINED)
@DiscriminatorColumn(name = "product_type", discriminatorType = DiscriminatorType.STRING)
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "id_product")
    protected Long idProduct;

    @Column(name = "product_type")
    protected String productType;

    protected String code;

    protected String picture;

    @Column(name = "price_Durty_Free")
    protected Double priceDutyFree;

    protected Double tax;

    @Column(name = "price_All_Tax_Included")
    protected Double priceAllTaxIncluded;

    @Column(name = "begin_Date")
    protected Date beginDate;

    @Column(name = "end_Date")
    protected Date endDate;

    protected String comment;

    protected String status; //VENDU, LOUER ...

    protected String title;
}
