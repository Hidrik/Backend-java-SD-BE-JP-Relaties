package nl.novi.javaprogrammeren.huiswerk.inheritance;

public abstract class AnotherAnimal {

    private String name;
    private String gender;
    private String sound;

    public AnotherAnimal(String name, String gender, String sound) {
        this.name = name;
        this.gender = gender;
        this.sound = sound;
    }

    public void move() {
        System.out.println(name + " is 0,25 meter verplaatst.");
    }

    public void sleep() {
        System.out.println("Lekker 8 uur slapen!");
    }

    public void eat(String food) {
        System.out.println(this.name + " eet lekker " + food);
    }

    public void makeNoise() {
        System.out.println(this.sound);
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
