package ifsantana.outbound.factories;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ifsantana.inbound.events.ReapitEntryProcessedEvent;
import ifsantana.outbound.factories.interfaces.Factory;
import ifsantana.outbound.models.QueryModel;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class QueryModelFactory implements Factory<QueryModel, ReapitEntryProcessedEvent> {
  private final ObjectMapper objectMapper;
  private static final Random rand = new Random ();

  public QueryModelFactory(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }

  @Override
  public QueryModel create(ReapitEntryProcessedEvent input) {
    try {
      return new QueryModel(rand.nextInt(), this.objectMapper.writeValueAsString(input.getData()));
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }
}
