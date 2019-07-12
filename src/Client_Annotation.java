import Bean.User2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client_Annotation {
    @Test
    public void Test2(){

        //通过配置文件获取容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("file:F:/project/IDEA/SpringMVC/Web/WEB-INF/applicationContext_annotation.xml");

        User2 user2 = (User2) ac.getBean("user");
        User2 user21 = (User2) ac.getBean("user");


        System.out.println(user2);
    }

}
