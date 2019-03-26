package hongbao;

import java.util.ArrayList;
import java.util.Random;

public class chengyuan extends User{
    public chengyuan() {
    }

    public chengyuan(String name, int yue) {
        super(name, yue);
    }

    // 定义 收红包方法

    public void shou(ArrayList<Double> list){
        Random random = new Random();
        int anInt = random.nextInt(list.size());

        Double remove = list.remove(anInt);

        setYue(remove);


    }
}
