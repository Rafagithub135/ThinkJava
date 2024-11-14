package ThinkJavaChapter12Practice;

public class Card {
    private final int rank;
    private final int suit;


    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static void main(String[] args) {
//        Card card = new Card(11, 2);
//        System.out.println(card);
        createDeck();
//        printDeck();
        Card card = new Card(5, 2);
        System.out.println(binarySearch(cards, card));
//        System.out.println(binarySearch(cards, new Card(15, 1)));
        System.out.println(binarySearchRecursive(cards, card, 0, cards.length - 1));
    }

    public static final String[] RANKS = {
            null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
    };

    public static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"
    };

    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    public boolean equals(Card that) {
        return this.rank == that.rank && this.suit == that.suit;
    }

    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }

    static Card[] cards = new Card[52];
    public static void createDeck() {
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    public static void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public static int searchCard(Card[] cards, Card target) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Card[] cards, Card target) {
        int low = 0;
        int high = cards.length -1;
        System.out.println(low + ", " + high);
        while (low <= high) {
            int mid = (low + high) / 2;
            int comp = cards[mid].compareTo(target);
            if (comp == 0) {
                return mid;
            } else if (comp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            System.out.println(low + ", " + high);
        }
        return -1;
    }

    public static int binarySearchRecursive(Card[] cards, Card target, int low, int high) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        int comp = cards[mid].compareTo(target);
        if (comp == 0) {
            return mid;
        } else if (comp < 0) {
            return binarySearchRecursive(cards, target, mid + 1, high);
        } else {
            return binarySearchRecursive(cards, target, low, mid - 1);
        }
    }

}