import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public abstract class Manipulations implements ToDoMethods {

  Integer ID;
  private String commandID;
  private String usageDescription;
  private static String FILE_NAME = "data.csv";
  private static Path filePath = Paths.get(FILE_NAME);
  List<String> allToDo;


  public Manipulations(String commandID, String usageDescription) {
    this.commandID = commandID;
    this.usageDescription = usageDescription;

  }

  public Manipulations() {
  }

  public static Path getFilePath() {
    return filePath;
  }


  public String getCommandID() {
    return commandID;
  }

  public String getUsageDescription() {
    return commandID + " - " + usageDescription;
  }


}
