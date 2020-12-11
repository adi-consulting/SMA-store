package referential;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReferentialServiceApplication implements CommandLineRunner {


    public static void main(String[] args){
        SpringApplication.run(ReferentialServiceApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

    }
}
