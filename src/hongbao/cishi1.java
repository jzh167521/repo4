package hongbao;

import java.util.ArrayList;

public class cishi1 {
    public static void main(String[] args) {
        qunzhu1 qz = new qunzhu1("群主",300);

        chengyuan cy = new chengyuan("成员1",100);
        chengyuan cy1 = new chengyuan("成员2",100);
        chengyuan cy2 = new chengyuan("成员3",100);

        ArrayList<Double> fa = qz.fa(100, 3);

        cy.shou(fa);
        cy.show();

        cy1.shou(fa);
        cy1.show();

        cy2.shou(fa);
        cy2.show();
    }
}
