package Test;

import javax.naming.Name;

public class Teache03 extends Person03 {
//2.定义Teacher类，继承Person，该类具有如下成员:
//(1)属性：学科(变量名自取，字符串类型)
    private String xueke;
//(2)构造方法：无参构造方法，有参构造方法

    public Teache03() {
        this.xueke = xueke;
    }

    public Teache03(String name, int age, String xueke) {
        super(name, age);
        this.xueke = xueke;
    }

//(3)成员方法：getXxx方法，setXxx方法，讲课方法teach，方法没有形参，返回值类型是void，方法内打印xx老师讲授yy课（xx是变量，yy也是变量）

    public String getXueke() {
        return xueke;
    }

    public void setXueke(String xueke) {
        this.xueke = xueke;
    }

    public void teach(){
        System.out.println(getName()+"老师,讲授"+xueke+"课");
    }
}
