package ifsantana.outbound.repositories;

import ifsantana.outbound.models.QueryModel;
import java.util.ArrayList;
import java.util.List;
//import lombok.experimental.UtilityClass;

//@UtilityClass
public class InMemoryQueryModelRepository {
  private static final List<QueryModel> queries = new ArrayList<>();

  public static void addQueryModel(QueryModel queryModel) {
    queries.add(queryModel);
  }
}
