package ThinkJavaChapter12Practice;

public class Card {
    private int rank;
    private int suit;


    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String s = ranks[this.rank] + " of " + suits[this.suit];
        return s;
    }

    public static void main(String[] args) {
        Card card = new Card(11, 2);
        System.out.println(card);
    }

}