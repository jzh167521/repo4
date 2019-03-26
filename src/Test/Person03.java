package Test;

public class Person03 {
//1.定义Person类，具有如下成员:
//(1)属性：姓名(name,字符串类型)、年龄(age,int类型)
    private String name;
    private int age;

//(2)构造方法：无参构造方法，有参构造方法

    public Person03() {
    }

    public Person03(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //(3)成员方法：getXxx方法，setXxx方法，显示基本信息的showMsg方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void showMsg(){
        System.out.println("名字:"+name+",年龄"+age);

    }
}
