package Hb;

import java.util.ArrayList;

public class ceshilei {
    public static void main(String[] args) {

        // 创建群主
        qunzhu qz = new qunzhu("小张",500);
        int i = 0;
        int a = 0;
        // 创建群众
        qunzhong qz1 = new qunzhong("群众1",0);
        qunzhong qz2 = new qunzhong("群众2",0);
        qunzhong qz3 = new qunzhong("群众3",0);
        qunzhong qz4 = new qunzhong("群众4",0);
        qunzhong qz5 = new qunzhong("群众5",0);

        ArrayList<Double> fa = qz.fa(125, 5);

        qz1.shou(fa);
        qz2.shou(fa);
        qz3.shou(fa);
        qz4.shou(fa);
        qz5.shou(fa);


        qz.show();
        qz1.show();
        qz2.show();
        qz3.show();
        qz4.show();
        qz5.show();

    }

}
