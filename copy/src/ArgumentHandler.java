public class ArgumentHandler {

  static void checkArgs(String[] args) {
    if (args.length == 0) {
      Operations.printUsage();
    }
  }
}
