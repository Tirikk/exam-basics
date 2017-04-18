import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OddAvgTest {
  @Test
  void testOddAverage() {
    ArrayList<Integer> listOfNumbers = new ArrayList<>();
    for (int i = 1; i < 10; i++) {
      listOfNumbers.add(i);
    }
    assertEquals(5.0, OddAvg.oddAverage(listOfNumbers));
  }

  @Test
  void testOddAverage_empty() {
    ArrayList<Integer> listOfNumbers = new ArrayList<>();
    assertEquals(Double.NaN, OddAvg.oddAverage(listOfNumbers));
  }
}