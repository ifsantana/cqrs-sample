package ifsantana.outbound.controllers.v1.facebook;

import ifsantana.outbound.models.QueryModel;
import ifsantana.outbound.repositories.InMemoryQueryModelRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/outbound")
public class FacebookController {

  @GetMapping(value = "/facebook")
  public ResponseEntity get() {
    var result = InMemoryQueryModelRepository.getQueries();
    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}
