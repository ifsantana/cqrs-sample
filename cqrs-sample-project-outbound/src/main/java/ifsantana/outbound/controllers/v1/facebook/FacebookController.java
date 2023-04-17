package ifsantana.outbound.controllers.v1.facebook;

import ifsantana.outbound.handlers.queries.interfaces.QueryHandler;
import ifsantana.outbound.queries.facebook.GetFacebookAdsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/outbound")
public class FacebookController {
  private final QueryHandler queryHandler;

  @Autowired
  public FacebookController(QueryHandler queryHandler) {
    this.queryHandler = queryHandler;
  }

  @GetMapping(value = "/facebook")
  public ResponseEntity get() {
    return new ResponseEntity<>(this.queryHandler.handle(new GetFacebookAdsQuery()), HttpStatus.OK);
  }
}
