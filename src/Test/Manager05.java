package Test;

public class Manager05 extends Employee05 {
//2.定义经理Manager类继承Employee类，该类具有如下成员:
//(1)属性:职员Clerk(该经理的职员)
    Clerk05 c;
//(2)方法:
//①空参数构造方法和满参数构造方法

    public Manager05() {

    }



    public Manager05(String name, String workId, String dept) {
        super(name, workId, dept);

    }

//②属性的get和set方法

    public Clerk05 getClerk() {
        return c;
    }

    public void setClerk(Clerk05 c) {
        this.c = c;
    }

//③重写父类的showMsg方法，方法内先调用父类的showMsg方法，然后打印经理中的职员的名字

    @Override
    public void showMsg() {
        super.showMsg();
        System.out.println("他的职员是"+c.getName()+",编号为:"+c.getWorkId());
    }
}
