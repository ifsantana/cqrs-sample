package ifsantana.outbound.repositories;

import ifsantana.outbound.models.QueryModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryModelRepository extends MongoRepository<QueryModel, Long>{
}
