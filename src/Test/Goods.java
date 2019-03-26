package Test;

public class Goods {
//(1)属性:商品名称（字符串类型），id（int类型），价格（double类型）
    private String name;
    private int id;
    private double jiage;
//(2)方法：
//①属性对应的get/set方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getJiage() {
        return jiage;
    }

    public void setJiage(double jiage) {
        this.jiage = jiage;
    }

    //②提供空参数构造方法和满参数构造方法
    public Goods() {
    }

    public Goods(String name, int id, double jiage) {
        this.name = name;
        this.id = id;
        this.jiage = jiage;
    }
    //③定义show方法，方法没有形参，方法的返回值类型是void,方法内打印商品的名称，
    // id,价格
    public void show(){
        System.out.println("商品名称:"+name);
        System.out.println("\tid:"+id);
        System.out.println("\t价格:"+jiage);
    }

}
