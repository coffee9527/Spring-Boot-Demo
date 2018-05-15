package top.pancras.service;

import org.springframework.web.bind.annotation.*;
import top.pancras.entity.Computer;

/**
 * Created by Administrator on 2018/4/14 0014.
 */
@RequestMapping("/computer")
public interface ComputerService {
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    String info();

    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    String getName(@RequestParam("name") String name);

    @RequestMapping(value = "/more", method = RequestMethod.GET)
    Computer more(@RequestHeader("name") String name, @RequestHeader("cpu") String cpu, @RequestHeader("content") int content);

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    String detail(@RequestBody Computer computer);
}
