package ifsantana.outbound.handlers.events.interfaces;

import ifsantana.outbound.queries.interfaces.Query;

public interface QueryHandler<R, C extends Query<R>> {
  R handle(C query);
}