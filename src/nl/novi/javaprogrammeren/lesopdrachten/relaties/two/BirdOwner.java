package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirdOwner {

    private String name, sex;
    private List<Bird> birds = new ArrayList<>();

    public BirdOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void addBird(Bird addedBird) {
        if (!this.birds.contains(addedBird)) {
            this.birds.add(addedBird);
        } else {
            System.out.println("Vogel is al toegevoegd!");
        }
    }

    public String toString() {
        String printedString = "De eigenaar is " + this.name;
        if (birds.size() != 0){
            printedString += " en heeft de volgende vogels: ";
            for (Bird bird : birds) {
                printedString += "naam: " + bird.getNickname() + ", serienummer: " + bird.getRingNumber() + ". ";
            }
        }
        System.out.println(printedString);
        return printedString;
    }

    public void keepTenBirds() {
        int femaleCount = 0;
        int maleCount = 0;

        List<Bird> remainingBirds = new ArrayList<>();


        Collections.shuffle(birds);
        for (Bird bird : this.birds) {
            if (bird.getSex().equals("vrouw")) {
                if (femaleCount < 5) {
                    remainingBirds.add(bird);
                }
                femaleCount ++;
            } else {
                if (maleCount < 5) {
                    remainingBirds.add(bird);
                }
                maleCount ++;
            }
        }

        birds = remainingBirds;

        for (Bird bird: birds) {
            System.out.println(bird.getNickname());
        }
    }
}
