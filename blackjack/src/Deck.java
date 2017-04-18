import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  ArrayList<Card> cards = new ArrayList<>();

  Deck(int numberOfCards) {
    String[] colors = {"hearts", "spades", "diamonds", "clubs"};
    String[] values = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    for (int i = 0; i < numberOfCards; i++) {
      cards.add(new Card(colors[numberOfCards % 4], values[(int) Math.random() * 13]));
    }
  }

  void shuffle() {
    Collections.shuffle(cards);
  }

  Card draw() {
    Card temp = cards.get(0);
    cards.remove(0);
    return temp;
  }
}
