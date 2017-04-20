import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ToDoApp {
  List<Manipulations> manipulations;
  List<String> allToDos;

  public ToDoApp() {
    manipulations = new ArrayList<>();
    manipulations.add(new ListToDos());
    manipulations.add(new AddToDos());
    manipulations.add(new RemoveToDos());
    manipulations.add(new CompleteToDos());
    manipulations.add(new UpdateToDos());
  }

  public String printUsage() {
    String usage =  "\n" +"Java myTodo application\n" +
            "=======================\n" +
            "Command line arguments:\n";
    for (Manipulations temp : manipulations){
      usage += temp.getUsageDescription();
    }
    return usage;
  }

  public String engine(String[] args) {
    String inner = "";
    if(args.length == 0) {
      return printUsage();
    }
    for (Manipulations m : manipulations) {
      if (m.getCommandID().equals(args[0])) {
        inner = m.execute(allToDos).toString();
      }
    }
    return inner;
  }

}
