package javaspringbootprofile.javaspringbootprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringBootProfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringBootProfileApplication.class, args);
        System.out.println("=== spring profile is running ======");
    }

}
