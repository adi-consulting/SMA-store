package referential.model;

public enum GearBox {
    MANUELLE("Manuelle"),
    AUTOMATIQUE("Automatique");

    public final String gearBox;

    private GearBox(String gearBox){
        this.gearBox = gearBox;
    }
}
