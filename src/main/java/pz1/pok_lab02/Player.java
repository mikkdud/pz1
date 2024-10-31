/**
 * TODO: think if hand should be final or if there should be method drawing card or whole hand from a player
 */

package pz1.pok_lab02;

import java.util.HashSet;
import java.util.Set;

public class Player {

    private Set<Card> hand;
    private final String name;


    /**
     * Constructs a Player instance with the specified hand and name.
     *
     * @param hand the set of cards representing the player's hand
     * @param name the name of the player
     */
    private Player(Set<Card> hand, String name) {
        this.hand = hand;
        this.name = name;
    }


    /**
     * method creating a player with assigned set of five cards
     * Creates a new player with a hand of five cards drawn from the given deck.
     *

     * @param deck the deck from which the player draws cards
     * @param name the name of the player
     * @return a new Player instance with an assigned hand of five cards
     */
    public static Player createPlayerWithHand(Deck deck, String name) {
        Set<Card> hand = new HashSet<>();
        for (int i=0; i<5; i++) {
            if (deck.isEmpty()) {
                System.out.println("deck is empty, impossible to draw a card!");
            } else {
                hand.add(deck.drawCard());
            }
        }
        return new Player(hand, name);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Player " + this.name + ":\n");
        for (Card card : hand) {
            sb.append(card).append("\n");
        }
        return sb.toString();
    }
}