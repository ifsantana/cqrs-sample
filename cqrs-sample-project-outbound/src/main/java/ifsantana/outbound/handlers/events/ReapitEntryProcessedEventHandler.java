package ifsantana.outbound.handlers.events;

import ifsantana.inbound.events.ReapitEntryProcessedEvent;
import ifsantana.outbound.factories.QueryModelFactory;
import ifsantana.outbound.handlers.events.interfaces.EventHandler;
import ifsantana.outbound.models.QueryModel;
import ifsantana.outbound.repositories.InMemoryQueryModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReapitEntryProcessedEventHandler implements EventHandler<ReapitEntryProcessedEvent> {
  private final QueryModelFactory queryModelFactory;

  @Autowired
  public ReapitEntryProcessedEventHandler(QueryModelFactory queryModelFactory) {
    this.queryModelFactory = queryModelFactory;
  }

  @Override
  public void onApplicationEvent(ReapitEntryProcessedEvent event) {
    QueryModel queryModel = this.queryModelFactory.create(event);
    InMemoryQueryModelRepository.addQueryModel(queryModel);
  }
}
