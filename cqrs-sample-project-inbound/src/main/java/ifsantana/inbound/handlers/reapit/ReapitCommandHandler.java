package ifsantana.inbound.handlers.reapit;

import ifsantana.inbound.commands.reapit.ReapitCommand;
import ifsantana.inbound.commands.reapit.ReapitCommandResult;
import ifsantana.inbound.handlers.interfaces.CommandHandler;
import org.springframework.stereotype.Service;

@Service
public class ReapitCommandHandler implements CommandHandler<ReapitCommandResult, ReapitCommand> {

  @Override
  public ReapitCommandResult handle(ReapitCommand command) {
    return new ReapitCommandResult(true, null);
  }
}
