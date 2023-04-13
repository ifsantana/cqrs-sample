package ifsantana.inbound.handlers.interfaces;

import ifsantana.inbound.commands.interfaces.Command;

@FunctionalInterface
public interface CommandHandler<R, C extends Command<R>> {
  R handle(C command);
}