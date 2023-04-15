package ifsantana.outbound.handlers.queries;

import ifsantana.outbound.handlers.events.interfaces.QueryHandler;
import ifsantana.outbound.queries.facebook.GetFacebookAdsQuery;
import ifsantana.outbound.queries.facebook.GetFacebookAdsQueryResult;
import org.springframework.stereotype.Service;

@Service
public class GetFacebookAdsQueryHandler implements QueryHandler<GetFacebookAdsQueryResult, GetFacebookAdsQuery> {

  @Override
  public GetFacebookAdsQueryResult handle(GetFacebookAdsQuery query) {
    return null;
  }
}
