package hongbao;
/*
定义用户类 共有的属性  名字  余额
 */
public class User {
    private String name;
    private double yue;

    public User() {
    }

    public User(String name, double yue) {

        this.name = name;
        this.yue = yue;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYue() {
        return yue;
    }

    public void setYue(double yue) {
        this.yue = yue;
    }

    // 打印用户信息
    public void show(){
        System.out.println("用户名"+name+"---余额:"+yue);
    }
}
