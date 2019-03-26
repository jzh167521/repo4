package Test;

import java.util.ArrayList;

public class GouWuChe06 {
//(1)成员属性:
//①创建ArrayList<Goods>集合
    ArrayList<Goods> list = new ArrayList<>();
//(2)方法
//①空参数构造方法和满参数构造方法

    public GouWuChe06() {
    }

    public GouWuChe06(ArrayList<Goods> list) {
        this.list = list;
    }
    //②定义添加方法的方法
//1)方法的名字叫addGoods
//2)方法的形参是Goods类类型
//3)方法内调用集合的add方法，将传递过来的商品传递进去
    public void  addGoos(Goods g){
        list.add(g);
        }



//③定义showGoods方法
//1)方法没有形参
//2)方法的返回值类型是void
//3)遍历集合(这个集合在成员属性的位置定义的)
//4)获取集合中的每一个商品，调用商品的show方法
    public void showGoods(){
        System.out.println("您选购的商品为:");
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            goods.show();
        }

    }

//④定义removeGoods方法
//1)方法的形参是Goods类型
//2)方法的返回值类型是void
    public void removeGoods(Goods g){

        list.remove(g);

    }
//⑤定义total方法
//1)方法没有形参
//2)方法的返回值类型是void
//3)方法内遍历集合计算商品的总和并打印
    public void total(){
        // 记录和
        double num = 0;
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            num+=goods.getJiage();
        }
        System.out.println("总计:"+num);
    }
}
