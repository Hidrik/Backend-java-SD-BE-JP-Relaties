package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class MainCar {
    /*
    Maak de volgende drie klassen:
    CarOwner, Car, CarDealer.

    Verzin zelf wat simpele instance variables bij CarOwner en CarDealer.
    Car heeft: kenteken, merk, subtype, aantalKmGereden

    Een CarOwner kan 0 of meerdere auto's hebben.
    Een CarDealer kan 0 of meerdere auto's hebben.
    Een Car kan 0 of 1 owner hebben (alleen CarOwner-klasse). Wanneer de auto bij de dealer staat is de carowner
    leeg (null).

    Voeg aan de CarDealer een methode toe die een auto vanuit zijn garage kan overschrijven naar de CarOwner. Zowel
    de list van CarOwner moet dan uitgebreid worden als de eigenaar van de Car moet aangepast worden. We hebben het hier
    dus over een bidirectionele relatie!

    Zorg ervoor dat alleen unieke auto's op basis van een kenteken aan de List van CarDealer en CarOwner toegevoegd
    kunnen worden.

    Extra: Voeg een variabele leeftijd toe aan CarOwner. Check daarna altijd of de CarOwner wel 18 of ouder is.

     */
    public static void main(String[] args) {

        CarDealer carDealer = new CarDealer();
        CarOwner carOwner = new CarOwner("Hidrik", 22);
        CarOwner toYoungCarOwner = new CarOwner("Hugo", 6);


        Car peugeot = new Car("12-34-56", "Peugeot", "208", 61000L);


        Car opel = new Car("12-34-56", "Opel", "Astra", 150000L);


        Car audi = new Car("65-43-21", "Audi", "R8", 61000L);

        //Kan deze auto gewoon toevoegen!
        carDealer.addCar(peugeot);

        //Kan deze auto niet toevoegen want het kenteken bestaat al!
        carDealer.addCar(opel);

        //Kan deze auto gewoon toevoegen
        carDealer.addCar(audi);

        //carOwner heeft nu auto Peugeot
        carDealer.soldCar(peugeot, carOwner);

        //carOwner heeft al een auto met dit kenteken!
        carOwner.addCar(opel);

        //carDealer heeft deze auto niet meer!
        carDealer.soldCar(peugeot, carOwner);

        //toYoungCarOwner is te jong om een auto te kopen!
        carDealer.soldCar(audi, toYoungCarOwner);

        for (Car ownedCar : carOwner.getOwnedCars()) {
            System.out.println("De carOwner heeft deze auto's: " + ownedCar.getMerk() + " " + ownedCar.getSubtype() + ". ");
        }

        for (Car ownedCar : carDealer.getCars()) {
            System.out.println("De carDealer heeft deze auto's: " + ownedCar.getMerk() + " " + ownedCar.getSubtype() + ". ");
        }

    }
}
