package ifsantana.inbound.commands.reapit;

import ifsantana.inbound.commands.interfaces.Command;

public class ReapitCommand implements Command<Object> {
  private ReapitEntryDto reapitEntryDto;

  public ReapitCommand() {
  }

  public ReapitCommand(ReapitEntryDto reapitEntryDto) {
    this.reapitEntryDto = reapitEntryDto;
  }

  public ReapitEntryDto getReapitEntryDto() {
    return reapitEntryDto;
  }

  public void setReapitEntryDto(ReapitEntryDto reapitEntryDto) {
    this.reapitEntryDto = reapitEntryDto;
  }
}
