package Demo;

import java.util.ArrayList;

/*
定义群主类  继承用户类
 */
public class qunzhu extends User{
    // 添加构造方法


    public qunzhu() {
    }

    public qunzhu(String username, double yue) {
        super(username, yue);
    }



    // 定义方法 群主发红包的方法  // 参数 要发的整数钱 int money  和 分成若干份 int count
    public ArrayList<Double> send(int money,int count){//100  3
        // 获取群主的余额  输入的余额就是群主的余额
        double leftmoney = getYue();//300.0
        // 判断 如果发的钱数比群主余额的钱数大 就说明群主余额里面不够发
        if (money > leftmoney){//100 < 300
            // 返回 null
            return null;
        }
        // 修改群主的余额 setYue  原有的余额 减去 要发出去的钱就是 剩下的余额
        setYue(leftmoney - money);//300-100

        // 创建一个集合 保存等分金额
        ArrayList<Double> list = new ArrayList<>();

        // 把钱扩大100倍  相当于折算成 分 为单位  避免小数运算损失精度的问题
        money=money*100;//100*100  10000

        // 每份金额的钱 要发的钱 除以 要分几份
        int m = money / count;//10000 / 3 = 3333
        // 不能整除的余数
        int l =money % count ;// 1分

        //无论是否整除, n-1 份  , 都是每份的等额金额
        for (int j = 0; j <count-1 ; j++) {
            // 缩小100被 折算成元
            list.add(m / 100.0);//3333/ 100.0
        }

        //判断是否能被整除
        if (l == 0){
            // 能整除, 最后一份金额 与之前每份金额一致
            list.add(m/100.0);// 除以100是吧分转换成元
        }else {
            //不能被整除 最后一份的金额 是之前每份金额+余数金额
            list.add((m+l)/ 100.0);

        }

        // 返回集合
        return list;
    }


    }
