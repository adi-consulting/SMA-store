package referential.model;

public enum CarType {

    SUV("4X4 Suv"),
    BERLINE("Berline"),
    BREAK("Break"),
    CABRIOLET("Cabriolet"),
    CITADINE("Citadine"),
    COUPE("Coupé"),
    AUTRE("Autre");


    public  final String carType;

    private CarType(String carType){
        this.carType = carType;
    }




}
