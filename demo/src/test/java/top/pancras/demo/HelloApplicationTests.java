package top.pancras.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import top.pancras.demo.web.HelloController;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Administrator on 2018/4/11 0011.
 */
//引入Spring对JUnit4的支持
@RunWith(SpringJUnit4ClassRunner.class)
//指定SpringBoot的启动类
@SpringApplicationConfiguration
//开启Web应用的配置，用于模拟ServletContext
@WebAppConfiguration
public class HelloApplicationTests {
    //MockMvc对象用于模拟调用Controller的接口发起请求，在@Test定义的hell测试用例中，perform函数执行一次请求调用，accept用于执行接受的数据类型，andExcept用于判断接受返回的期望值
    private MockMvc mvc;

    //定义在测试用例@Test内容执行前预加载的内容，这里用来初始化对HelloController的模拟
    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void hello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("hello index")));
    }
}
