package HBanlie;

import java.util.ArrayList;
import java.util.Random;

public class chengyuan extends User {
    public chengyuan() {
    }

    public chengyuan(String name, double ymoney) {
        super(name, ymoney);
    }
    // 定义收钱的方法   传入一个集合  从集合中随机 那一个元素 别切删除拿到的这个元素
    public void shou(ArrayList<Double> list){
        // 创建随机对象
        Random r = new Random();
        int i = r.nextInt(list.size());

        // money 就是 随机上次的呢也元素  也就是  成员 拿到的呢份钱
        Double money = list.remove(i);

        // 吧这份钱添加到成员的余额中
        setYmoney(money+getYmoney());



    }
}
