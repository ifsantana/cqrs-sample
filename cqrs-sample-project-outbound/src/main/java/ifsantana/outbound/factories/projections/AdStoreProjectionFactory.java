package ifsantana.outbound.factories.projections;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ifsantana.inbound.factories.interfaces.Factory;
import ifsantana.outbound.events.FeedAdEntryProcessedEvent;
import ifsantana.outbound.models.QueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdStoreProjectionFactory implements Factory<FeedAdEntryProcessedEvent, QueryModel> {
  private final ObjectMapper objectMapper;

  @Autowired
  public AdStoreProjectionFactory(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }

  @Override
  public FeedAdEntryProcessedEvent create(QueryModel input) {
    FeedAdEntryProcessedEvent feedAdEntry = null;
    try {
      feedAdEntry = this.objectMapper.readValue(input.getBody(), FeedAdEntryProcessedEvent.class);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
    return feedAdEntry;
  }
}
