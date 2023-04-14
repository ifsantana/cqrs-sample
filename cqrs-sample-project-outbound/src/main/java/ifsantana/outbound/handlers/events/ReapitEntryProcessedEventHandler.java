package ifsantana.outbound.handlers.events;

import ifsantana.inbound.events.ReapitEntryProcessedEvent;
import ifsantana.outbound.handlers.events.interfaces.EventHandler;
import ifsantana.outbound.models.QueryModel;
import ifsantana.outbound.repositories.InMemoryQueryModelRepository;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class ReapitEntryProcessedEventHandler implements EventHandler<ReapitEntryProcessedEvent> {
  private static final Random rand = new Random();
  @Override
  public void onApplicationEvent(ReapitEntryProcessedEvent event) {
    System.out.println(event.getData().getSuccess());
    InMemoryQueryModelRepository.addQueryModel(new QueryModel(rand.nextInt(), event.getData().toString()));
  }
}
