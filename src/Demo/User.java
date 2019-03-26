package Demo;
/*
定义一个用户类
 */
public class User {
    //成员变量
    private String username;// 用户
    private double yue;//余额
    // 构造方法

    public User() {
    }

    public User(String username, double yue) {

        this.username = username;
        this.yue = yue;
    }

    // get / set

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getYue() {
        return yue;
    }

    public void setYue(double yue) {
        this.yue = yue;
    }

    // 展示信息方法
    public void  show(){
        System.out.println("用户名:"+username+"--余额为:"+yue);
    }
}
