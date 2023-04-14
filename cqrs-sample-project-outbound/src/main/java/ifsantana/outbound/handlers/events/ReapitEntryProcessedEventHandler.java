package ifsantana.outbound.handlers.events;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import ifsantana.inbound.events.ReapitEntryProcessedEvent;
import ifsantana.outbound.handlers.events.interfaces.EventHandler;
import ifsantana.outbound.models.QueryModel;
import ifsantana.outbound.repositories.InMemoryQueryModelRepository;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class ReapitEntryProcessedEventHandler implements EventHandler<ReapitEntryProcessedEvent> {
  private final ObjectMapper objectMapper;
  private static final Random rand = new Random ();
  public ReapitEntryProcessedEventHandler() {
    this.objectMapper = new ObjectMapper();
    this.objectMapper.registerModule(new JavaTimeModule());
  }

  @Override
  public void onApplicationEvent(ReapitEntryProcessedEvent event) {
    System.out.println(event.getData().getSuccess());
    QueryModel model = null;
    try {
      model = new QueryModel(rand.nextInt(), this.objectMapper.writeValueAsString(event.getData()));
      InMemoryQueryModelRepository.addQueryModel(model);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }
}
