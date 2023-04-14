package ifsantana.inbound.commands.reapit;

public class ReapitCommandResult<T> {
  private Boolean success;
  private T data;

  public ReapitCommandResult(Boolean success, T data) {
    this.success = success;
    this.data = data;
  }

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
