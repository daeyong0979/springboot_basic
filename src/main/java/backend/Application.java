package backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        //SpringApplication springApplication = new SpringApplication(Application.class);
        //springApplication.setAddCommandLineProperties(false);  // it will disable command
        //springApplication.run(args);

        SpringApplication.run(Application.class, args);

    }
}
