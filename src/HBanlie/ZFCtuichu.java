package HBanlie;

import java.util.ArrayList;
import java.util.Scanner;

public class ZFCtuichu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();


        while (true) {
            System.out.println("请输入一个字符串");

            String s = sc.nextLine();

            if (s.equals("退出")){
                break;
            } list.add(s);
        }

        System.out.println(list);
    }
}
