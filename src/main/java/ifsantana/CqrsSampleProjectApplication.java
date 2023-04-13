package ifsantana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ifsantana.*")
public class CqrsSampleProjectApplication {

  public static void main(String[] args) {
    SpringApplication.run(CqrsSampleProjectApplication.class, args);
  }
}
