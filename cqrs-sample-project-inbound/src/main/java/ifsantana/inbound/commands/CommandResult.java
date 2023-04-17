package ifsantana.inbound.commands;

public class CommandResult<T> {
  private Boolean success;
  private T data;

  public CommandResult(Boolean success, T data) {
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
