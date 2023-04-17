package ifsantana.outbound.models;

public class QueryModel {

  private Integer id;
  private String body;

  public QueryModel(Integer id, String body) {
    this.id = id;
    this.body = body;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }
}
