package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {

    private String name;
    private String sex;
    private Dog dog;

    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setDog(Dog dog) {
        if (this.dog == null) {
            this.dog = dog;
        } else {
            System.out.println("Eigenaar heeft al een hond");
        }
    }

    public void dogBirthday() {
        dog.setAge(dog.getAge() + 1);
    }

    public void setDogName(String newName) {
        dog.setName(newName);
    }

    @Override
    public String toString() {
        return this.name + " heeft een " + dog.getSex() + ", deze is " + dog.getAge() + " jaar oud en van het soort: " + dog.getSpecies() + ". De hond heet: " + dog.getName();
    }

}
