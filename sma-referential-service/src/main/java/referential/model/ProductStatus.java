package referential.model;

public enum ProductStatus {

    AVAILABLE("available"), SOLD("sold"), RENTED("rented");

    public final String label;

    private ProductStatus(String label) {
        this.label = label;
    }
}
