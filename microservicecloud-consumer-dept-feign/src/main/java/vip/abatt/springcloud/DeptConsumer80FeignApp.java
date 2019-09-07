package vip.abatt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"vip.abatt.springcloud"})
@ComponentScan("vip.abatt.springcloud")
public class DeptConsumer80FeignApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80FeignApp.class, args);
    }
}
