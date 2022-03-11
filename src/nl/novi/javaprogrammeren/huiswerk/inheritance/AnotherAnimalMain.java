package nl.novi.javaprogrammeren.huiswerk.inheritance;

import nl.novi.javaprogrammeren.lesopdrachten.inheritance.one.Animal;
import nl.novi.javaprogrammeren.lesopdrachten.inheritance.one.PetAnimal;
import nl.novi.javaprogrammeren.lesopdrachten.inheritance.one.WildAnimal;

import java.util.ArrayList;
import java.util.List;

public class AnotherAnimalMain {

    // LET OP: het eerste gedeelte is hetzelfde als de klassikale opdracht.

    /*
    Het is traditie om overerving uit te leggen met behulp van dieren. Hier ontkomen jullie dus ook niet aan.

    Opdracht
    Bekijk de beschrijving van onderstaande dieren. Bedenk wat je in de superklasse kan zetten. De subklassen hoef
    je nog niet te maken.

    Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op en de hoeveelheid kinderen.

    Van een Tijger slaan we de naam, naam van het hok, geslacht, weekdag dat die het laatst gevoed is en land van
    herkomst op. Ook willen we het aantal strepen weten.

    Van een Hond slaan we naam, naam van het baasje, favoriete voedselmerk, geslacht en soort op.
    Van een Kat slaan we de naam, naam van het baasje, favoriete voedsel merk, geslacht en soort op. Ook willen we weten
    of het een binnen of buitenkat is.

    Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor het laatste gevoed is en land van
    herkomst op. Ook willen we de naam van de roedel weten.

    Alle dieren moeten kunnen bewegen. Dit moet als methode toegevoegd worden. Wanneer een huisdier beweegt print je in
    de console dat deze 0.25 is verplaatst. Bij alle andere dieren is dat 0.50.

    Alle dieren moeten ook een maak-geluid-methode hebben waarmee je het geluid van de dieren afdrukt naar de console.

    Alle dieren slapen 8 uur per dag. Maak een methode slapen en print dit uit wanneer de methode wordt aangeroepen.

    Alle dieren eten. Maak een methode die een String ontvangt en print dan uit wat het dier eet.

    Alles staat hier in het Nederlands beschreven. Schrijf je klassen-, variabele en methodenamen in het Engels.

     */

    /*
    UITBREIDING
    Maak nu ook de subklassen en override of super de methodes waar jij denkt dat je het nodig acht.
    Zorg ervoor dat de Animal-klasse niet geinstantieerd kan worden.

    Er zijn hier meerdere oplossingen mogelijk. Bijna allemaal zijn ze goed, zolang je jouw oplossing maar kan
    beargumenteren.
     */

    public static void main(String[] args) {
        List<AnotherAnimal> animals = new ArrayList<>();



        AnotherWildAnimal lion = new AnotherWildAnimal("Peter", "Mannetje", "Brult", "Leeuwen-den", "Woensdag", "Nambia");
        lion.setChildrenCount(5);
        animals.add(lion);

        AnotherWildAnimal tiger = new AnotherWildAnimal("Pieter", "Mannetje", "Brult", "Tijger-hol", "Maandag", "Zimbabwe");
        tiger.setStripeCount(30);
        animals.add(tiger);

        AnotherWildAnimal wolf = new AnotherWildAnimal("Mariska", "Vrouwtje", "Huilt", "Wolvenhok", "Donderdag", "Nederland");
        wolf.setPackName("Mariska's roedel");
        animals.add(wolf);

        AnotherPetAnimal cat = new AnotherPetAnimal("Oreo", "Vrouwtje", "Miauwt", "Mariska", "Vlees", "Lapjeskat");
        cat.setTypeOfCat("Binnen");
        animals.add(cat);

        AnotherPetAnimal dog = new AnotherPetAnimal("Bubbels", "Mannetje", "Blaft", "Mariska", "Brokjes", "Amerikaanse Stafford");
        animals.add(dog);

        dog.move();
        dog.makeNoise();
        wolf.makeNoise();
        wolf.move();
    }

}
