package Bean;

public class User {
    private Integer id;
    private String uName;
    private String pwd;
    private Pet myPet;

    public User(String uName, Pet myPet){
        this.myPet = myPet;
        this.uName = uName;
        System.out.println("构造函数1");
    }
    public User(Integer uName,Pet myPet){
        this.uName = uName.toString();
        this.myPet = myPet;
        System.out.println("构造函数2");
    }

    public User() {
        System.out.println("构造方法");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

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

    public void UserInit(){
        System.out.println("创建执行");
    }
    public void UserDestroy(){
        System.out.println("销毁");
    }
}
