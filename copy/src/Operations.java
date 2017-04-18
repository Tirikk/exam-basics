import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Operations {

  static void printUsage() {
    System.out.printf("Usage:\ncopy [source] [destination]");
  }

  static void noDestination() {
    System.out.println("No destination provided");
  }

  static void copy(String source, String destination) {
    List<String> content;
    Path sourcePath = Paths.get(source);
    Path destinationPath = Paths.get(destination);
    try {
      content = Files.readAllLines(sourcePath);
      Files.write(destinationPath, content, StandardOpenOption.CREATE);
    } catch (IOException e) {
      System.out.println("No such file or directory");
    }
  }
}
