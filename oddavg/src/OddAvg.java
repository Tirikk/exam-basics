import java.util.ArrayList;

public class OddAvg {
  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
  }

  public double oddAverage(ArrayList<Double> listOfNumbers) {
    ArrayList<Double> oddNumbers = new ArrayList<>();
    for (Double number : listOfNumbers) {
      if (number % 2 != 0) {
        oddNumbers.add(number);
      }
    }
  }
}
