package ifsantana.outbound.handlers.queries;

import ifsantana.outbound.factories.GetFacebookQueryResultFactory;
import ifsantana.outbound.handlers.queries.interfaces.QueryHandler;
import ifsantana.outbound.queries.facebook.GetFacebookAdsQuery;
import ifsantana.outbound.queries.facebook.GetFacebookAdsQueryResult;
import ifsantana.outbound.repositories.InMemoryQueryModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetFacebookAdsQueryHandler implements QueryHandler<GetFacebookAdsQueryResult, GetFacebookAdsQuery> {

  private final GetFacebookQueryResultFactory resultFactory;

  @Autowired
  public GetFacebookAdsQueryHandler(GetFacebookQueryResultFactory resultFactory) {
    this.resultFactory = resultFactory;
  }

  @Override
  public GetFacebookAdsQueryResult handle(GetFacebookAdsQuery query) {
    return this.resultFactory.create(InMemoryQueryModelRepository.getQueries());
  }
}
