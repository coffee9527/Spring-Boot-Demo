package top.pancras.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/12 0012.
 */
@RestController
public class LoginController {

    @RequestMapping(value="/login/{name}", method = RequestMethod.GET)
    public String login(@PathVariable String name) {
        return "hi! "+name;
    }
}
