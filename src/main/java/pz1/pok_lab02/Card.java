package pz1.pok_lab02;

import java.util.Objects;

public class Card {
    /**
     * Class represents a Card with attributes:
     * rank
     * suit
     */


    private final Ranks rank;
    private final Suits suit;


    public Card(Ranks rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }


    /** getters */
    public Ranks getRank() {
        return rank;
    }


    public Suits getSuit() {
        return suit;
    }


    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    /**
     * Compares this card to the specified object.
     *
     * @param o the object to compare with
     * @return true if the specified object is equal to this card, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && suit == card.suit;
    }
    /**
     * @return a hash code value for this card based on its rank and suit.
     */
    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }



    public enum Suits {
        SPADES, HEARTS, CLUBS, DIAMONDS
    }


    public enum Ranks {
        DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }
}