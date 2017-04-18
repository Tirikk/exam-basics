import java.util.ArrayList;

public class Deck {
  ArrayList<Card> cards = new ArrayList<>();

  Deck(int numberOfCards) {
    String[] colors = {"hearts", "spades", "diamonds", "clubs"};
    String[] values = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    if (numberOfCards <= 4) {
      for (int i = 0; i < numberOfCards; i++) {
        cards.add(new Card(colors[i], values[(int) Math.random() * 13]));
      }
    } else {
      for (int i = 0; i < numberOfCards; i++) {
        cards.add(new Card(colors[numberOfCards % 4], values[(int) Math.random() * 13]));
      }
    }
  }
}
