package HBanlie;

import java.util.ArrayList;

public class cishi {
    public static void main(String[] args) {
        // 定义测试类
        // 创建 群主 对象
        qunzhu qunzhu = new qunzhu("群主",500);

        // 创建 三个 成员
        chengyuan cy = new chengyuan("成员1",1);
        chengyuan cy1 = new chengyuan("成员2",2);
        chengyuan cy2 = new chengyuan("成员3",0);


        System.out.println("===============开始抢红包===============");

        // 调用群主 发红包功能
        ArrayList<Double> fa = qunzhu.fa(200, 3);
        // 判断 如果fa 等于 null 说明输入的钱大于 钱包里面的余额
        if (fa == null){
            System.out.println("不好意思,群主卡余额不够");
        }else {
            // 调用成员抢红包功能
            cy.shou(fa);
            cy1.shou(fa);
            cy2.shou(fa);

            // 查看 成员和群主 里面有多少钱
            System.out.println("群主余额还剩:");
            qunzhu.show();
            System.out.println("成员余额抢完红包后:");
            cy.show();
            cy1.show();
            cy2.show();
        }
    }
}
