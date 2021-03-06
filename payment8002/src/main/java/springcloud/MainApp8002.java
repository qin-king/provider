package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author King-qin
 * @create 2019-12-29 20:15
 */

@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8002 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp8002.class,args);
    }

}
