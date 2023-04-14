package ifsantana.outbound.models;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.Transient;
//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collation = "queries")
public class QueryModel {
//  @Transient
//  public static final String SEQUENCE_NAME = "queries_sequence";
//  @Id
  private Integer id;
  private String body;

  public QueryModel(Integer id, String body) {
    this.id = id;
    this.body = body;
  }
}
