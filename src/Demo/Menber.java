package Demo;

import java.util.ArrayList;
import java.util.Random;

/*
 定义成员类 继承 用户类
 */
public class Menber extends User {
    // 添加构造方法


    public Menber() {
    }

    public Menber(String username, double yue) {
        super(username, yue);
    }

    // 打开红包就是从集合中,随机抽取一份 保存到自己的余额中
    public void openhongbao(ArrayList<Double> list){
        // 创建随机对象
        Random r = new Random();
        // 随机生成一个角标 在集合里面
        int index = r.nextInt(list.size());

        // 移除这个角标的金额
        Double remove = list.remove(index);
        // 直接调用父类里面的方法 设置金额
        setYue(remove+getYue());


    }
}
