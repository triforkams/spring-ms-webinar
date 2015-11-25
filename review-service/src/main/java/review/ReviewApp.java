package review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // <- register with Eureka
public class ReviewApp {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ReviewApp.class, args);
    }
}
