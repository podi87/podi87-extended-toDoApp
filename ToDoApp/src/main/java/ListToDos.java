import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ListToDos extends Manipulations {

  public ListToDos() {
    super("-l", "Lists all ToDos");
  }

  @Override
  public Object execute(Object input) {
    List<String> allToDo = new ArrayList<>();
    try {
      allToDo = Files.readAllLines(getFilePath());
    } catch (IOException e) {
      e.getMessage();
    }
    if (allToDo.size() == 0) {
      System.out.println("No todos for today");
    }
    else {
      for (int i = 0; i < allToDo.size(); i++) {
        ID = i + 1;
        System.out.println(ID + " - " +  allToDo.get(i));
      }
    }
    return allToDo;
  }
}
