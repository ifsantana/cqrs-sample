package ifsantana.inbound.repositories;

import ifsantana.inbound.models.CommandModel;
import java.util.ArrayList;
import java.util.List;
//import lombok.experimental.UtilityClass;

public class InMemoryCommandRepository {
  private static List<CommandModel> commands = new ArrayList<>();

  public static void addCommandModel(CommandModel commandModel) {
    commands.add(commandModel);
  }
}
