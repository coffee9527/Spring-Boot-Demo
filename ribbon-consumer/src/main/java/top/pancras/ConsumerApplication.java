package top.pancras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/4/12 0012.
 */
//SpringCloudApplication也有熔断器机制
//熔断器机制
@EnableCircuitBreaker
//服务注册和发现
@EnableDiscoveryClient
//启动类
@SpringBootApplication
public class ConsumerApplication {

    @Bean//注入bean实例
    @LoadBalanced//开启负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);}
}
