package Demo;
/*
定义抽象类shirou 继承 Animal
 */
public  abstract class shirou extends Animal {
    public shirou() {
    }

    public shirou(String leixing, String name, String color) {
        super(leixing, name, color);
    }

    @Override
    public void chi() {
        System.out.println(getName()+","+getLeixing()+" 正在吃肉.....");
    }
    // 定义抽象方法 品种  食肉动物 分为
    public abstract void pinzhong ();
}
