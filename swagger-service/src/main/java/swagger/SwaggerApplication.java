package swagger;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableZuulProxy
@EnableSwagger2
public class SwaggerApplication {

    public static void main(String[] args) {
        System.out.println("test deploy 10-09-18");
        SpringApplication.run(SwaggerApplication.class, args);
    }

}
