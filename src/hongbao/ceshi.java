package hongbao;

import java.util.ArrayList;

public class ceshi {
    public static void main(String[] args) {
        // 创建群主
        qunzhu qz = new qunzhu("群主",500);
        // 调用方法查看群主的余额
        System.out.println("群主现余额中有的钱:");
        qz.show();
        // 创建群众
        qunzhong qz1 = new qunzhong("群众1", 5);
        qunzhong qz2 = new qunzhong("群众2", 6);
        qunzhong qz3 = new qunzhong("群众3", 7);
        System.out.println("群众现有的余额中的钱:");
        qz1.show();
        qz2.show();
        qz3.show();

        System.out.println("===================开始抢红包========================");
        // 群主调用发红包方法 进行给群众们发红包
        ArrayList<Integer> fa = qz.fa(300, 3);
        // 判断 如果 fa 是 null 就说明里面群主有的余额 就不够 群主要发的钱
       if (fa == null){
           System.out.println("不好意思,群主的余额不足,要给大家发的红包");
       }else {
           // 否则就调用 群众收红包的方法 吧 群主集合里面的 钱 每人拿一份
           qz1.shou(fa);
           qz2.shou(fa);
           qz3.shou(fa);
           // 再次打印群众抢完红包的余额信息
           System.out.println("群主发完红包后现余额中有的钱:");
           qz.show();
           System.out.println("群众抢完群主红包后的余额中的钱:");
           qz1.show();
           qz2.show();
           qz3.show();
       }

        System.out.println("===================开始再次抢红包========================");

        // 群主调用发红包方法 进行给群众们发红包
        ArrayList<Integer> fa1 = qz.fa(180, 3);
        // 判断 如果 fa 是 null 就说明里面群主有的余额 就不够 群主要发的钱
        if (fa1 == null){
            System.out.println("不好意思,群主的余额不足,要给大家发的红包");
        }else {
            // 否则就调用 群众收红包的方法 吧 群主集合里面的 钱 每人拿一份
            qz1.shou(fa1);
            qz2.shou(fa1);
            qz3.shou(fa1);
            // 再次打印群众抢完红包的余额信息
            System.out.println("群主再次发完红包后的余额中有的钱:");
            qz.show();
            System.out.println("群众再次抢完群主红包后的余额中的钱:");
            qz1.show();
            qz2.show();
            qz3.show();
        }


    }
}
