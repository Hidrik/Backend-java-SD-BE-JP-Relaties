package nl.novi.javaprogrammeren.huiswerk.inheritance;

import nl.novi.javaprogrammeren.lesopdrachten.inheritance.one.Animal;

public class AnotherPetAnimal extends AnotherAnimal {

    private String nameOwner;
    private String favoriteFood;
    private String species;
    private String typeOfCat;

    public AnotherPetAnimal(String name, String gender, String sound, String nameOwner, String favoriteFood, String species) {
        super(name, gender, sound);
        this.nameOwner = nameOwner;
        this.favoriteFood = favoriteFood;
        this.species = species;
    }

    public void setTypeOfCat(String typeOfCat) {
        this.typeOfCat = typeOfCat;
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " is 0,50 meter verplaatst.");
    }
}