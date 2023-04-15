package ifsantana.inbound.models;

//import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.SequenceGenerator;
//import jakarta.persistence.Table;
//import org.hibernate.annotations.TypeDef;
//import org.hibernate.annotations.Type;
import java.time.Instant;
import java.util.UUID;

//@Entity
//@Table(name = "commands")
//@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
//@Getter
//@Setter
//@AllArgsConstructor
public class CommandModel {
//  @Id
//  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
//  @SequenceGenerator(name = "generator", sequenceName = "commands_seq", allocationSize = 1)
//  @Column(name = "id", nullable = false)
  private Integer id;

//  @Column(name = "status", nullable = false)
//  @Enumerated(EnumType.STRING)
  private TransactionStatus status;

//  @Type(JsonBinaryType.class)
//  @Column(name = "command_data", columnDefinition = "jsonb", nullable = false)
  private String commandData;

//  @Column(name = "transaction_date", nullable = false)
  private Instant transactionDate;

//  @Column(name = "transaction_id")
  private UUID transactionId;

  public enum TransactionStatus {
    SUCCESS,
    ERROR
  }

  public static class CommandMetaData {
    private String body;

    public CommandMetaData(String body) {
      this.body = body;
    }
  }

  public CommandModel(Integer id, TransactionStatus status, String command_data,
      Instant transactionDate, UUID transactionId) {
    this.id = id;
    this.status = status;
    this.commandData = command_data;
    this.transactionDate = transactionDate;
    this.transactionId = transactionId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TransactionStatus getStatus() {
    return status;
  }

  public void setStatus(TransactionStatus status) {
    this.status = status;
  }

  public String getCommandData() {
    return commandData;
  }

  public void setCommandData(String commandData) {
    this.commandData = commandData;
  }

  public Instant getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(Instant transactionDate) {
    this.transactionDate = transactionDate;
  }

  public UUID getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }
}
