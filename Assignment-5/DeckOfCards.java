import java.util.*;

public class DeckOfCards {

    static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        for(String suit: suits)
            for(String rank: ranks)
                deck.add(rank + " of " + suit);
        return deck;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> deck = createDeck();
        Collections.shuffle(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        int cardsPerPlayer = deck.size()/players;

        for(int i=0;i<players;i++){
            System.out.println("Player "+(i+1)+":");
            for(int j=0;j<cardsPerPlayer;j++)
                System.out.println(deck.get(i*cardsPerPlayer+j));
            System.out.println();
        }
    }
}