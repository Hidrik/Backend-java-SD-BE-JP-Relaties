package nl.novi.javaprogrammeren.huiswerk.relaties.two;


import java.sql.Array;

public class Competition {


    /*
     * Programmeer de volgende relaties:
     * Een competitie kan minimaal 18 en maximaal 18 clubs hebben.
     * Een club kan bij 1 competitie horen en minimaal 18 spelers en maximaal 25 spelers hebben.
     * Een speler kan bij 1 club horen.
     *
     * Extra: Je moet via het speler object kunnen zeggen in welke competitie de speler speelt.
     */

    private String name;
    private Club[] clubs = new Club[18];

    public Competition(String name) {
        this.name = name;
    }

    public void addClub(Club club) {
        if (club.getPlayers().size() < 17) {
            System.out.println("Kan de club niet toevoegen aan de competitie want de club heeft te weinig spelers!");
            return;
        }

        for (int i = 0; i < clubs.length; i++) {
            if (clubs[i] == null) {
                clubs[i] = club;
                for (Player player : club.getPlayers()) {
                    player.setCompetition(this);
                }
                return;
            }
            System.out.println("De competitie heeft al 18 clubs!");
        }
    }
}
