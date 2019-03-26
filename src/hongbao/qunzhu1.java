package hongbao;

import java.util.ArrayList;

public class qunzhu1 extends User{
    public qunzhu1() {
    }

    public qunzhu1(String name, int yue) {
        super(name, yue);
    }

    // 定义群主发红包方法
    public ArrayList<Double> fa(int qian,int count){//100  3
        double m = getYue();
        // 先判断 要发的 qian  是不是比 余额 yue 大
        if (qian > m){
            return null;
        }

        // 设置群主的余额 原本的余额 减去 要发 的钱
        setYue(m-qian);

        // 把要发的钱 转为分 为了防止整除不了 出现 精度损失
        qian=qian*100;

        // 把钱分成count分
        int qians = qian/count; //10000/3=3333
        // 钱 摸于 count 看最后剩下的钱 给最后以为
        int q = qian % count;  // 1

        // 创建存入钱的集合
        ArrayList<Double> list = new ArrayList<>();

        // count - 1  留一份 最后添加
        for (int i = 0; i < count-1; i++) {
            list.add(qians/100.0);//3333/100=33.33
        }

        // 判断 如果q 是0 就说明 可以被整除
        if (q == 0){
            list.add(qians/100.0);
        }else {// 否则就添加 一份钱数 和最后 剩余的钱
            list.add((qians+q)/100.0);//3333+1  /100.0
        }

        return list;
    }
}
