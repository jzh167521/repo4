package HBanlie;

import java.util.ArrayList;
import java.util.Arrays;

/*
继承用户类
 */
public class qunzhu extends User {
    public qunzhu() {
    }

    public qunzhu(String name, double ymoney) {
        super(name, ymoney);
    }

    // 定义发红包方法
    /*
    接受一个double集合里面存的是吧一整份钱分成N分
    形参: 要发的钱 和发几分
    方法内 先判断 看要发的钱 比 群主余额的钱 大 就给出提示
     */
    public ArrayList<Double> fa(int money,int count){
       //拿到群主的余额里面的钱
        double qian = getYmoney();
        if (money > qian){
            return null;
        }
        //设置群主余额里面的 钱  原来余额的钱 减去 发出去的钱
        setYmoney(qian - money);

        //创建集合用来装 把钱分成的count分
        ArrayList<Double> list = new ArrayList<>();

        // 吧钱转换为分  防止精度缺失
        money = money * 100;

        // 算出发的钱 分成count 分 每份是多少  int 接受
        int moneys = money / count;
        // 在算出发的钱 摸于 count  看能不能除尽  除不尽的呢个数用int 接受  (除不尽的呢个数就是多出来的钱)
        int m = money % count;

        // 把钱添加到集合中  添加count -1次   留一份 最后判断添加
        for (int i = 0; i < count-1; i++) {
            list.add(moneys / 100.0); // 每份钱 除以100.0 就是吧分转换为元
        }

        // 判断 看要发的钱 能不能 根count 除尽 当 m 等于 0 时就说明除尽 了
        if (m  == 0){
            list.add(moneys /100.0);// 能进来执行 说明这份钱可以除尽 于上面添加的一样
        }else { // 否则除不尽 就进来执行
            list.add((moneys+m)/100.0); // 最后一份就是 吧多余的呢点钱 添加到最后一份钱中
        }
        // 返回 集合
        return  list;
    }
}
