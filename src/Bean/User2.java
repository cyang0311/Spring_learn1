package Bean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//<Bean name="user" class="Bean.User">
//@Component("user")
//@Controller()     //web层
@Service("user")        //service层
//@Repository()       //dao层
@Scope(scopeName = "singleton")
public class User2 {
    private Integer id;
    private String uName;
    private String pwd;
    private Pet myPet;

    public User2(String uName,String pwd){
        this.uName = uName;
        this.pwd = pwd;
    }

    public User2() {
        System.out.println("User2的构造方法");
    }

    public Integer getId() {
        return id;
    }

    @Value("1")
    public void setId(Integer id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    @Value("张三")
    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Pet getMyPet() {
        return myPet;
    }

    //自动装配
    //@Autowired
    @Resource(name = "cat1")
    public void setMyPet(Pet myPet) {
        this.myPet = myPet;
    }

    @Override
    public String toString() {
        return "Bean.User{" +
                "id=" + id +
                ", uName='" + uName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", myPet=" + myPet +
                '}';
    }
    @PostConstruct()
    public void UserInit(){
        System.out.println("创建执行");
    }
    @PreDestroy()
    public void UserDestroy(){
        System.out.println("销毁");
    }
}
