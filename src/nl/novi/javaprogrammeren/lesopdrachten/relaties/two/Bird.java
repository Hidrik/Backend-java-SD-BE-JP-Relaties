package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

public class Bird {

    private String nickname, species, ringNumber, sex;

    public Bird(String nickname, String species, String ringNumber, String sex) {
        this.nickname = nickname;
        this.species = species;
        this.ringNumber = ringNumber;
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRingNumber() {
        return ringNumber;
    }

    public void setRingNumber(String ringNumber) {
        this.ringNumber = ringNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
