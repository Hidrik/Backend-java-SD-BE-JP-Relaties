
package nl.novi.javaprogrammeren.huiswerk.inheritance;

import nl.novi.javaprogrammeren.lesopdrachten.inheritance.one.Animal;

public class AnotherWildAnimal extends AnotherAnimal {

    private String penName;
    private String lastFedOnDay;
    private String countryOfOrigin;

    //When a lion
    private int childrenCount;

    //When a tiger
    private int stripeCount;

    //When a wolf
    private String packName;


    public AnotherWildAnimal(String name, String gender, String sound, String penName, String lastFedOnDay, String countryOfOrigin) {
        super(name, gender, sound);
        this.penName = penName;
        this.lastFedOnDay = lastFedOnDay;
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }

    public void setStripeCount(int stripeCount) {
        this.stripeCount = stripeCount;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }


}
