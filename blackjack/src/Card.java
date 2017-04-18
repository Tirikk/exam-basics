public class Card {
  String color;
  String value;

  Card(String color, String value) {
    this.color = color;
    this.value = value;
  }

  public String toString() {
    return value + " of " + color;
  }
}
