package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class Club {

    /*
     * Programmeer de volgende relaties:
     * Een competitie kan minimaal 18 en maximaal 18 clubs hebben.
     * Een club kan bij 1 competitie horen en minimaal 18 spelers en maximaal 25 spelers hebben.
     * Een speler kan bij 1 club horen.
     *
     * Extra: Je moet via het speler object kunnen zeggen in welke competitie de speler speelt.
     */

    List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        if (players.size() < 25) {
            players.add(player);
        } else {
            System.out.println("De club heeft al 25 spelers!");
        }
    }

    public void removePlayer(Player player) {
        if (players.size() >= 18) {
            players.remove(player);
        } else {
            System.out.println("De club houdt te weinig spelers over! Kan de speler niet verwijderen.");
        }
    }

    public List<Player> getPlayers() {
        return players;
    }
}
