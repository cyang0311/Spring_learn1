import Bean.Pet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)//使用JUnit测试，创建容器
@ContextConfiguration("classpath:applicationContext.xml")//读取配置文件
public class Client_JUnit {

    @Resource(name = "dog")
    private Pet dog;
    @Test
    public void Test(){
        System.out.println(dog);
    }
}
