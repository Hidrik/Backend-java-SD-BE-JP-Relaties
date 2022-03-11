package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class MainFootball {

    /*
     * Programmeer de volgende relaties:
     * Een competitie kan minimaal 18 en maximaal 18 clubs hebben.
     * Een club kan bij 1 competitie horen en minimaal 18 spelers en maximaal 25 spelers hebben.
     * Een speler kan bij 1 club horen.
     *
     * Extra: Je moet via het speler object kunnen zeggen in welke competitie de speler speelt.
     */

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        Club ajax = new Club();
        Competition eredivisie = new Competition("Eredivisie");

        //Can't add ajax because not enough players
        eredivisie.addClub(ajax);

        players.add(new Player("player1"));
        players.add(new Player("player2"));
        players.add(new Player("player3"));
        players.add(new Player("player4"));
        players.add(new Player("player5"));
        players.add(new Player("player6"));
        players.add(new Player("player7"));
        players.add(new Player("player8"));
        players.add(new Player("player9"));
        players.add(new Player("player10"));
        players.add(new Player("player11"));
        players.add(new Player("player12"));
        players.add(new Player("player13"));
        players.add(new Player("player14"));
        players.add(new Player("player15"));
        players.add(new Player("player16"));
        players.add(new Player("player17"));
        players.add(new Player("player18"));
        players.add(new Player("player19"));
        players.add(new Player("player20"));
        players.add(new Player("player21"));
        players.add(new Player("player22"));
        players.add(new Player("player23"));
        players.add(new Player("player24"));
        players.add(new Player("player25"));
        players.add(new Player("player26"));





        //Add 26 players, cant add last player because then more than 25 players are in the club
        for (Player player : players) {
            ajax.addPlayer(player);
        }

        //Removes 8 players, cant remove last player because then only 17 players remain
        for (int i = 0; i < 9; i++) {
            ajax.removePlayer(players.get(i));
        }

        //Add club to competition, no printed line!
        eredivisie.addClub(ajax);

        //Get player competition
        players.get(12).getCompetition();





    }
}
