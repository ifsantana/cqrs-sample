package ifsantana.inbound.bus;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public interface InMemoryBus {
  void publishEvent(ApplicationEvent event);
}
