package Hb;

import java.util.ArrayList;
import java.util.Random;

public class qunzhong extends Uesr {
    public qunzhong() {
    }

    public qunzhong(String name, double money) {
        super(name, money);
    }

    // 收红包方法
    public void shou(ArrayList<Double> list){
        Random r = new Random();

        int index = r.nextInt(list.size());

        Double qian = list.remove(index);

        setMoney(getMoney()+qian);


    }
}
