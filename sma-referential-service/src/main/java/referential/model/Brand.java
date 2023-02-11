package referential.model;

public enum Brand {

    AUDI("Audi"),
    BMW("Bmw"),
    CITROEN("Citroen"),
    FIAT("Fiat"),
    FORD("Ford"),
    MERCEDES("Mercedes"),
    OPEL("Opel"),
    PEUGEOT("Peugeot"),
    RENAULT("Renault"),
    VOLKSWAGUEN("Volkswaguen");

    public final String brand;

    private Brand(String brand){
        this.brand = brand;
    }

}
