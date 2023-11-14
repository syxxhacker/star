import java.util.Scanner;

public class Narcissus_Number {
    public static void main(String[] args) {
        //定义全局变量
        int num;
        int a;  //百位数
        int b;  //十位数
        int c;  //个位数

        //用for循环来控制范围
        for (num = 100;num <= 999;num++) {
            //求出百位数，十位数，个位数
            a = num / 100;
            b = (num / 10) % 10;
            c = num % 10;

            //判断是否为水仙花数，是的花就打印出来
            if ((a * a * a) + (b * b * b) + (c * c * c) == num) {
                System.out.println(num);
            }
        }
    }
}
