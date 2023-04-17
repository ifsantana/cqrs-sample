package ifsantana.inbound.events;


public class ReapitEntryProcessedEvent extends Event {
  private Object commandResult;

  public ReapitEntryProcessedEvent(Object source) {
    super(source);
    this.commandResult = source;
  }

  public Object getCommandResult() {
    return commandResult;
  }

  public void setCommandResult(Object commandResult) {
    this.commandResult = commandResult;
  }
}
