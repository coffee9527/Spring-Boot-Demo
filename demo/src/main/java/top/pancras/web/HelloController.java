package top.pancras.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/11 0011.
 * 必须要把Controller写在启动类所在包路径的子路经中才能访问到，该类就不能被访问
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "hello world";
    }
}
