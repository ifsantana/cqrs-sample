package ifsantana.inbound.events;

import ifsantana.inbound.commands.reapit.ReapitCommandResult;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class ReapitEntryProcessedEvent extends Event {
  private ReapitCommandResult data;

  public ReapitEntryProcessedEvent(ReapitCommandResult source) {
    super(source);
    this.data = source;
  }

  public ReapitCommandResult getData() {
    return data;
  }

  public void setData(ReapitCommandResult data) {
    this.data = data;
  }
}
