package Demo;
/*
定义父类 抽取动物中共有的特性
成员变量
动物类型  食草动物  食肉动物
动物都有 名字
动物都有 颜色

抽象类  抽象方法 动物 都吃东西  吃的不一样 定义抽象方法 吃
 */
public abstract class Animal {
    // 成员变量
     private String leixing;
     private String name;
     private String color;

     // 构造方法


    public Animal() {
    }

    public Animal(String leixing, String name, String color) {
        this.leixing = leixing;
        this.name = name;
        this.color = color;
    }

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
// 抽象方法 吃  动物都会吃
    public abstract void chi();

    // 打印动物信息
    public void show(){
        System.out.println("动物类型:"+leixing+",动物名字:"+name+",颜色:"+color);

    }
}
