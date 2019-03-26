package Hb;

import java.util.ArrayList;
import java.util.Random;

public class qunzhu extends Uesr{
    public qunzhu() {
    }

    public qunzhu(String name, double money) {
        super(name, money);
    }

    // 发红包的方法
    public ArrayList<Double> fa(int totomoney, int count){
        // 把元转换成分
        int qzmoney = totomoney *100;
        // 群主现在有的钱
        setMoney(getMoney()-totomoney);
        // 创建集合用来存储分好的钱
        ArrayList<Double> list = new ArrayList<>();

        int timp = count -1;
        Random r = new Random();

        for (int i = 0; i < timp; i++) {
            int qian = r.nextInt(qzmoney / count * 2) + 1;
            list.add(qian/100.0);
            qzmoney-=qian;
            count--;

        }

        list.add(qzmoney/100.0);

        return list;

    }

}
