package pl.bciborowski.emailapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmailappApplication {

    public static void main(String[] args) {

        Email email1 = new Email("John", "Smith");


        //SpringApplication.run(EmailappApplication.class, args);

    }

}
