
import Bean.Collection;
import Bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

    @Test
    public void Test(){

        //通过配置文件获取容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("file:F:/project/IDEA/SpringMVC/Web/WEB-INF/applicationContext_test.xml");
        User u = (User)ac.getBean("user");
//        Bean.User u = ac.getBean(Bean.User.class);
//        System.out.println(u.getPwd()+"   "+u.getuName()+"  "+u.getMyPet());

        User u1 = (User) ac.getBean("user1");
        System.out.println(u1);

        Collection collection1 = (Collection) ac.getBean("collection");
        System.out.println(collection1);

        ((ClassPathXmlApplicationContext) ac).close();
        System.out.println("完成销毁");
    }


}
