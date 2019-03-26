package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // 键盘录入15- 200 之间的数字
        int[] arr = new int[10];
        int in = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {


            System.out.println("请录入15-200之间的数字");
            int a = sc.nextInt();

            if (a >= 15 && a <= 200) {
               arr[in]=a;
                in++;
            } else {
                System.out.println("输入的数字不符合条件,请重新输入");
                i--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
