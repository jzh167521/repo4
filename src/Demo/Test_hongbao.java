package Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_hongbao {
    public static void main(String[] args) {
        // 创建一个群主对象
        qunzhu qz = new qunzhu("群主",200);

        // 创建键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要发的金额:");
        int money = sc.nextInt();
        System.out.println("请输入几个成员:");
        int count = sc.nextInt();

        // 发送红包
        ArrayList<Double> sendlist = qz.send(money,count);

        // 判断如果余额不足
        if (sendlist==null){
            System.out.println("余额不足");
            return;
        }
        // 创建三个成员
        Menber m = new Menber("小张",0);
        Menber m1 = new Menber("小纪",0);
        Menber m2 = new Menber("小杨",0);

        // 打开红包
        m.openhongbao(sendlist);
        m1.openhongbao(sendlist);
        m2.openhongbao(sendlist);

        // 展示信息
        qz.show();
        m.show();
        m1.show();
        m2.show();


    }
}
