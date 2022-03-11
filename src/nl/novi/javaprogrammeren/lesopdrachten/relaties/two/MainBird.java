package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class MainBird {

    /*
    Geef de klasse Bird de volgende instance variables: nickname, species, ringNumber
    De species en ringNumber variables mogen na instantiatie niet meer aangepast worden.

    Geef de klasse BirdOwner de volgende instance variables: name, sex.
    Er zijn geen restricties op getters en setters.

    Programmeer de volgende relatie.
    Een BirdOwner kan een oneindig aantal vogels hebben. Elke vogel mag echter maar 1 keer in de lijst voorkomen.
    Er mag geen List via de constructor gevuld worden. Dit moet via een methode.

    Maak een toString()-methode die het volgende afdrukt: Naam van eigenaar en van elke vogel de nickname en
    serienummer.

    Uitdagend:
    1. Zorg ervoor dat de BirdOwner minimaal 20 Bird-objecten heeft.
    2. De BirdOwner mag van de gemeente nog maar 10 Vogels houden. Hij wil random 5 vrouwtjes en vijf mannetjes kiezen.
    Schrijf een methode die dit doet en de vijf random gekozen mannetjes en de vijf random gekozen vrouwtjes uitprint.

     */

    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Bird("Vogel1", "Papegaai", "1", "man"));
        birds.add(new Bird("Vogel2", "Papegaai", "2", "man"));
        birds.add(new Bird("Vogel3", "Papegaai", "3", "man"));
        birds.add(new Bird("Vogel4", "Papegaai", "4", "man"));
        birds.add(new Bird("Vogel5", "Papegaai", "5", "man"));
        birds.add(new Bird("Vogel6", "Papegaai", "6", "man"));
        birds.add(new Bird("Vogel7", "Papegaai", "7", "man"));
        birds.add(new Bird("Vogel8", "Papegaai", "8", "man"));
        birds.add(new Bird("Vogel9", "Papegaai", "9", "man"));
        birds.add(new Bird("Vogel10", "Papegaai", "10", "man"));

        birds.add(new Bird("Vogel11", "Papegaai", "11", "vrouw"));
        birds.add(new Bird("Vogel12", "Papegaai", "12", "vrouw"));
        birds.add(new Bird("Vogel13", "Papegaai", "13", "vrouw"));
        birds.add(new Bird("Vogel14", "Papegaai", "14", "vrouw"));
        birds.add(new Bird("Vogel15", "Papegaai", "15", "vrouw"));
        birds.add(new Bird("Vogel16", "Papegaai", "16", "vrouw"));
        birds.add(new Bird("Vogel17", "Papegaai", "17", "vrouw"));
        birds.add(new Bird("Vogel18", "Papegaai", "18", "vrouw"));
        birds.add(new Bird("Vogel19", "Papegaai", "19", "vrouw"));
        birds.add(new Bird("Vogel20", "Papegaai", "20", "vrouw"));




        BirdOwner hidrik = new BirdOwner("Hidrik", "man");

        for (Bird bird: birds) {
            hidrik.addBird(bird);
        }

        //hidrik.toString();

        hidrik.keepTenBirds();

    }


}
