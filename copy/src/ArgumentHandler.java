public class ArgumentHandler {

  static void checkArgs(String[] args) {
    if (args.length == 0) {
      Operations.printUsage();
    } else if (args.length == 1) {
      Operations.noDestination();
    } else if (args.length == 2) {
      Operations.copy(args[0], args[1]);
    }
  }
}
