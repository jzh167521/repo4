package hongbao;

import java.util.ArrayList;

public class qunzhu extends User {
    public qunzhu() {

    }

    public qunzhu(String name, int yue) {
        super(name, yue);
    }

    // 定义独有方法 发红包  吧一份钱 平分成好几份 装入一个集合
    public ArrayList<Integer> fa(int monay,int count){

        // 判断 要发的钱是不是比 余额大
        if (monay>getYue()){
            return null;
        }

        // 重新设置 群主的余额  原有的余额 减去 发的红包
        setYue(getYue()-monay);
            // 创建集合 装 平分好的钱
        ArrayList<Integer> list = new ArrayList<>();


        // 要发的钱分成count 分 装入集合
        int monays = monay / count;

        for (int i = 0; i < count; i++) {
           list.add(monays);
        }

        return list;
    }

}
