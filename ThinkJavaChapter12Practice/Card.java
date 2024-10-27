package ThinkJavaChapter12Practice;

public class Card {
    private int rank;
    private int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    Card threeOfClubs = new Card(3, 0);

    String[] suits = new String{"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = new String{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

}