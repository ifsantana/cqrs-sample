package ifsantana.outbound.factories.projections;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ifsantana.inbound.events.ReapitEntryProcessedEvent;
import ifsantana.inbound.factories.interfaces.Factory;
import ifsantana.outbound.models.QueryModel;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class QueryModelProjectionFactory implements Factory<QueryModel, ReapitEntryProcessedEvent> {
  private final ObjectMapper objectMapper;
  private static final Random rand = new Random ();

  public QueryModelProjectionFactory(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }

  @Override
  public QueryModel create(ReapitEntryProcessedEvent input) {
    try {
      return new QueryModel(rand.nextInt(), this.objectMapper.writeValueAsString(input.getCommandResult()));
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }
}
