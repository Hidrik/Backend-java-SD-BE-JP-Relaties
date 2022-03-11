package nl.novi.javaprogrammeren.huiswerk.relaties.two;

public class Player {

    /*
     * Programmeer de volgende relaties:
     * Een competitie kan minimaal 18 en maximaal 18 clubs hebben.
     * Een club kan bij 1 competitie horen en minimaal 18 spelers en maximaal 25 spelers hebben.
     * Een speler kan bij 1 club horen.
     *
     * Extra: Je moet via het speler object kunnen zeggen in welke competitie de speler speelt.
     */

    private String name;
    private Competition competition;

    public Player(String name) {
        this.name = name;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }
}
