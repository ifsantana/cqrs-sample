package ifsantana.inbound.commands.reapit;

import ifsantana.inbound.commands.interfaces.Command;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ReapitCommand implements Command<ReapitCommandResult> {
  private String test;
}
