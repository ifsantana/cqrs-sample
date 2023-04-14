package ifsantana.inbound.controllers.v1.reapit;

import ifsantana.inbound.commands.reapit.ReapitCommand;
import ifsantana.inbound.handlers.interfaces.CommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/v1/webhooks/reapit")
public class ReapitWebhookController {
  private CommandHandler commandHandler;

  @Autowired
  public ReapitWebhookController(CommandHandler commandHandler) {
    this.commandHandler = commandHandler;
  }

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity notifications(@RequestBody ReapitCommand command) {
    return ok(this.commandHandler.handle(command));
  }
}
