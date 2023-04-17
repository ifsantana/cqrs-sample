package ifsantana.outbound.factories;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ifsantana.inbound.factories.interfaces.Factory;
import ifsantana.outbound.models.QueryModel;
import ifsantana.outbound.queries.facebook.GetFacebookAdsQueryResult;
import ifsantana.outbound.queries.facebook.GetFacebookAdsQueryResult.FacebookPropertyDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class GetFacebookQueryResultFactory implements Factory<GetFacebookAdsQueryResult, List<QueryModel>> {
  private final ObjectMapper objectMapper;

  public GetFacebookQueryResultFactory(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }

  @Override
  public GetFacebookAdsQueryResult create(List<QueryModel> input) {
    List<FacebookPropertyDto> data = new ArrayList<>();
    for(QueryModel model : input) {
      try {
        FacebookPropertyDto item = this.objectMapper.readValue(model.getBody(), FacebookPropertyDto.class);
        data.add(item);
      } catch (JsonProcessingException e) {
        throw new RuntimeException(e);
      }
    }
    return new GetFacebookAdsQueryResult(data);
  }
}
