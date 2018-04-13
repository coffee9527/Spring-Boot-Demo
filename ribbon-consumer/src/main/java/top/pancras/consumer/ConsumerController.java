package top.pancras.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.pancras.consumer.service.HelloService;

/**
 * Created by Administrator on 2018/4/12 0012.
 */
@RestController
public class ConsumerController {
//版本一：无熔断机制
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
//    public String helloConsumer() {
//        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
//    }
//
//    @RequestMapping(value = "/ribbon-consumer/hi", method = RequestMethod.GET)
//    public String hiConsumer() {
//        return restTemplate.getForEntity("http://HELLO-SERVICE/hi", String.class).getBody();
//    }
//
//    @RequestMapping(value = "/ribbon-consumer/login/{name}", method = RequestMethod.GET)
//    public String loginConsumer(@PathVariable String name) {
//        return restTemplate.getForEntity("http://HELLO-SERVICE/login/"+name, String.class).getBody();
//    }

    //版本二：有熔断机制
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.helloService();
    }

}
