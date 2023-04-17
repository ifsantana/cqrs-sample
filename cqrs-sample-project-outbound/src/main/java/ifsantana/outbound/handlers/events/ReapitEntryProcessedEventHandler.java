package ifsantana.outbound.handlers.events;

import ifsantana.inbound.events.ReapitEntryProcessedEvent;
import ifsantana.outbound.factories.projections.AdStoreProjectionFactory;
import ifsantana.outbound.factories.projections.QueryModelProjectionFactory;
import ifsantana.outbound.handlers.events.interfaces.EventHandler;
import ifsantana.outbound.models.QueryModel;
import ifsantana.outbound.repositories.InMemoryQueryModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReapitEntryProcessedEventHandler implements EventHandler<ReapitEntryProcessedEvent> {
  private final QueryModelProjectionFactory queryModelProjection;
  private final AdStoreProjectionFactory adStoreProjectionFactory;

  @Autowired
  public ReapitEntryProcessedEventHandler(QueryModelProjectionFactory queryModelProjection,
      AdStoreProjectionFactory adStoreProjectionFactory) {
    this.queryModelProjection = queryModelProjection;
    this.adStoreProjectionFactory = adStoreProjectionFactory;
  }

  @Override
  public void onApplicationEvent(ReapitEntryProcessedEvent event) {
    QueryModel queryModel = this.queryModelProjection.create(event);
    InMemoryQueryModelRepository.addQueryModel(queryModel);
    this.publishFeedAdEntryProcessedToAdStore(queryModel);
  }

  private void publishFeedAdEntryProcessedToAdStore(QueryModel model) {
    var feedAdEntryProcessedEvent = this.adStoreProjectionFactory.create(model);

    // eventBus.publish(feedAdEntryProcessedEvent);
    // or
    // httpClient.post(feedAdEntryProcessedEvent.adModel);
  }
}
