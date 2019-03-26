package Demo;
/*
创建shicao类 继承动物类

// 定义抽象类  下面写抽象方法 食草动物分为 羊科   牛科
 */
public abstract class shicao extends Animal  {

    public shicao() {
    }

    public shicao(String leixing, String name, String color) {
        super(leixing, name, color);
    }

    @Override
    public void chi() {
        System.out.println(getName()+","+getLeixing()+" 正在吃草.....");
    }

    //抽象方法 食草动物 能干什么
    public abstract void gongneng();
}
