package top.pancras.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/11 0011.
 */
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index() {
        return "hello index";
    }
}
