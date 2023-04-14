package ifsantana.inbound.commands.reapit;

import ifsantana.inbound.commands.interfaces.Command;

public class ReapitCommand implements Command<ReapitCommandResult> {
  private String description;

  public ReapitCommand() {
  }

  public ReapitCommand(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
