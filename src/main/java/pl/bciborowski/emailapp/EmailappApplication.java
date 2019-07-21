package pl.bciborowski.emailapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmailappApplication {

    public static void main(String[] args) {

        Email email1 = new Email("John", "Smith");

        email1.changePassword("zorzetka");
        email1.setAlternateEmail("abc@xyz.com");
        email1.setMailboxCapacity(100);
        //SpringApplication.run(EmailappApplication.class, args);

    }

}
