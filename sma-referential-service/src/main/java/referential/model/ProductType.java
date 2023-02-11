package referential.model;

public enum ProductType {

    CAR("car"), MEDICATION("medication"), VARIOUS("various");

    public final String label;

    private ProductType(String label) {
        this.label = label;
    }
}
