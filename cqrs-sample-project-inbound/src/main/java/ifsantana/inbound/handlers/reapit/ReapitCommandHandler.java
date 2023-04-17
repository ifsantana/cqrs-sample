package ifsantana.inbound.handlers.reapit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ifsantana.inbound.bus.InMemoryBus;
import ifsantana.inbound.commands.CommandResult;
import ifsantana.inbound.commands.reapit.ReapitCommand;
import ifsantana.inbound.events.ReapitEntryProcessedEvent;
import ifsantana.inbound.handlers.interfaces.CommandHandler;
import ifsantana.inbound.models.CommandModel;
import ifsantana.inbound.models.CommandModel.TransactionStatus;
import ifsantana.inbound.repositories.InMemoryCommandRepository;
import java.time.Instant;
import java.util.Random;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReapitCommandHandler implements CommandHandler<Object, ReapitCommand> {
  private final ObjectMapper objectMapper;
  private static final Random rand = new Random();

  private final InMemoryBus inMemoryBus;
  @Autowired
  public ReapitCommandHandler(InMemoryBus inMemoryBus) {
    this.inMemoryBus = inMemoryBus;
    this.objectMapper = new ObjectMapper();
  }

  @Override
  public Object handle(ReapitCommand command) {
    try {

      var commandModel = new CommandModel(rand.nextInt(), TransactionStatus.SUCCESS,
          this.objectMapper.writeValueAsString(command), Instant.now(), UUID.randomUUID());

      InMemoryCommandRepository.addCommandModel(commandModel);

      this.inMemoryBus.publishEvent(
          new ReapitEntryProcessedEvent(command.getReapitEntryDto().getOld())
      );

      return new CommandResult<>(true, commandModel);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }
}
