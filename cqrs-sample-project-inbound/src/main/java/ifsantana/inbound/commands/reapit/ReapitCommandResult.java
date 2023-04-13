package ifsantana.inbound.commands.reapit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ReapitCommandResult<T> {
  private Boolean success;
  private T data;
}
