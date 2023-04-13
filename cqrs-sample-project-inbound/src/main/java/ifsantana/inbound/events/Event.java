package ifsantana.inbound.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public abstract class Event extends ApplicationEvent {
  Event(Object source) {
    super(source);
  }
}
