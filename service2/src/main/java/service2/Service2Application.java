package service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 中巴价值投资研习社
 *
 * @ author: tangjianhua
 * @ date: 2017/12/11.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service2Application {
    @RequestMapping("/service2")
    public String service2() {
        return "service2";
    }

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class, args);
    }
}
