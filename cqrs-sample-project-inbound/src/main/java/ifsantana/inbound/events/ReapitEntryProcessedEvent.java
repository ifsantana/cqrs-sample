package ifsantana.inbound.events;

import ifsantana.inbound.commands.reapit.CommandResult;

//@Getter
//@Setter
public class ReapitEntryProcessedEvent extends Event {
  private CommandResult data;

  public ReapitEntryProcessedEvent(CommandResult source) {
    super(source);
    this.data = source;
  }

  public CommandResult getData() {
    return data;
  }

  public void setData(CommandResult data) {
    this.data = data;
  }
}
