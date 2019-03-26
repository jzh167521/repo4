package HBanlie;
/*
定义用户类
 */
public class User {
    private String name;
    private double ymoney;

    public User() {
    }

    public User(String name, double ymoney) {
        this.name = name;
        this.ymoney = ymoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYmoney() {
        return ymoney;
    }

    public void setYmoney(double ymoney) {
        this.ymoney = ymoney;
    }

    public void show(){
        System.out.println("名字:"+name+",余额:"+ymoney);
    }
}
