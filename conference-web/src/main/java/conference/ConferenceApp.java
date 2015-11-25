package conference;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication  // <- 3-for-1
public class ConferenceApp {
    public static void main(String[] args) {
        SpringApplication.run(ConferenceApp.class, args);
    }
}
