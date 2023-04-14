package ifsantana.outbound.handlers.events;

import ifsantana.inbound.events.ReapitEntryProcessedEvent;
import ifsantana.outbound.handlers.events.interfaces.EventHandler;
import org.springframework.stereotype.Service;

@Service
public class ReapitEntryProcessedEventHandler implements EventHandler<ReapitEntryProcessedEvent> {

  @Override
  public void onApplicationEvent(ReapitEntryProcessedEvent event) {
    System.out.println(event.getData().getSuccess());
  }
}
