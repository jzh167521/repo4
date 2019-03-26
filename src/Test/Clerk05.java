package Test;

public class Clerk05 extends Employee05 {
//(1)属性:经理Manager(该职员的经理)
     Manager05 m;
//(2)方法:
//①空参数构造方法和满参数构造方法

    public Clerk05() {

    }



    public Clerk05(String name, String workId, String dept) {
        super(name, workId, dept);

    }

//②属性的get和set方法

    public Manager05 getManager() {
        return m;
    }

    public void setManager(Manager05 m) {
       this.m = m;
    }

//③重写showMsg方法，方法内先调用父类的showMsg方法，然后打印经理的名字

    @Override
    public void showMsg() {
        super.showMsg();
        System.out.println("他的经理是"+m.getName()+",编号为:"+m.getWorkId());
    }
}
