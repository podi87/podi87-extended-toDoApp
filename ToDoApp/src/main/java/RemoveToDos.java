import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RemoveToDos extends Manipulations {

  public RemoveToDos() {
    super("-r", "Removes a ToDo");
  }

  @Override
  public Object execute(Object input) {
    List<String> allToDo = new ArrayList<>();
    try {
      allToDo = Files.readAllLines(getFilePath());
      allToDo.remove(input);
      Files.write(getFilePath(), allToDo);
    } catch (IOException e) {
      e.getMessage();
    } catch (ArrayIndexOutOfBoundsException e) {
      e.getMessage();
      System.out.println("There is no ToDo with this number");
    }
    return allToDo;
  }

}
