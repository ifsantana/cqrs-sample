package ifsantana.inbound.handlers.reapit;

import ifsantana.inbound.bus.InMemoryBus;
import ifsantana.inbound.commands.reapit.ReapitCommand;
import ifsantana.inbound.commands.reapit.ReapitCommandResult;
import ifsantana.inbound.events.ReapitEntryProcessedEvent;
import ifsantana.inbound.handlers.interfaces.CommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReapitCommandHandler implements CommandHandler<ReapitCommandResult, ReapitCommand> {
  private final InMemoryBus inMemoryBus;
  @Autowired
  public ReapitCommandHandler(InMemoryBus inMemoryBus) {
    this.inMemoryBus = inMemoryBus;
  }
  @Override
  public ReapitCommandResult handle(ReapitCommand command) {
    var result = new ReapitCommandResult(true, null);
    this.inMemoryBus.publishEvent(
        new ReapitEntryProcessedEvent(result)
    );
    return result;
  }
}
