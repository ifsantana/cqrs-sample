package ifsantana.inbound.events.interfaces;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public interface EventHandler<TEvent extends ApplicationEvent> {

  @EventListener
  void onApplicationEvent(TEvent event);
}
