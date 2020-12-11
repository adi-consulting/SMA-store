package store.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Product {

    protected Long idProduct;

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
