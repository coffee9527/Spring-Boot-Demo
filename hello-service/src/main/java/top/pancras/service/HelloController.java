package top.pancras.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Administrator on 2018/4/12 0012.
 */
@RestController
public class HelloController {
    //默认是apache的日志
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello, host:" + instance.getHost() + " service_id:"
                + instance.getServiceId());
        return "hello world";
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "hi";
    }
}
