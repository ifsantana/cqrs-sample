package ifsantana.inbound.commands.reapit;

import ifsantana.inbound.commands.interfaces.Command;

public class ReapitCommand implements Command<CommandResult> {
  private ReapitEventDto reapitEventDto;

  public ReapitCommand() {
  }

  public ReapitCommand(ReapitEventDto reapitEventDto) {
    this.reapitEventDto = reapitEventDto;
  }

  public ReapitEventDto getReapitEventDto() {
    return reapitEventDto;
  }

  public void setReapitEventDto(ReapitEventDto reapitEventDto) {
    this.reapitEventDto = reapitEventDto;
  }
}
