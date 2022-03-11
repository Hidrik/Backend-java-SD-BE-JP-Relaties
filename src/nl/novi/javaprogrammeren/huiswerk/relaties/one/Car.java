package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class Car {

    private String kenteken, merk, subtype;
    private long aantalKmGereden;

    private CarOwner owner;

    public Car(String kenteken, String merk, String subtype, long aantalKmGereden) {
        this.kenteken = kenteken;
        this.merk = merk;
        this.subtype = subtype;
        this.aantalKmGereden = aantalKmGereden;
    }

    public void setOwner(CarOwner owner) {
        this.owner = owner;
    }

    public String getKenteken() {
        return kenteken;
    }

    public String getMerk() {
        return merk;
    }

    public String getSubtype() {
        return subtype;
    }

    public long getAantalKmGereden() {
        return aantalKmGereden;
    }

    public CarOwner getOwner() {
        return owner;
    }
}
