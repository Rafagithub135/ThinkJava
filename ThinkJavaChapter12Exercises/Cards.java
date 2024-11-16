package ThinkJavaChapter12Exercises;

import ThinkJavaChapter12Practice.Card;

public class Cards {
    private final int suit;
    private final int rank;

    public Cards(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public static void main(String[] args) {
        makeDeck();
        suitHist(new int[7]);
    }

    public static final String[] RANKS = {
            null, "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
    };

    public static void makeDeck() {
        int[] deck = new int[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                deck[index] = rank;
                index++;
            }
        }
    }

    public int compareTo(Card that) {
        if (this.suit < that.getSuit()) {
            return -1;
        }
        if (this.suit > that.getSuit()) {
            return 1;
        }
        if (this.rank < that.getRank()) {
            return -1;
        }
        if (this.rank > that.getRank()) {
            return 1;
        }
        return 0;
    }

    public static int[] suitHist(int[] hand) {
        int[] suits = new int[4];
        for (int i = 0; i < hand.length; i++) {
            int card = hand[i];
            int suit = card / 13;
            suits[suit]++;
            System.out.println(suits[suit]);
        }
        return suits;
    }
}
