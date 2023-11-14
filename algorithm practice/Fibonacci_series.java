import java.util.Scanner;
// 程序分析：
// 第一个月：1对兔子;
// 第二个月：1对兔子；
// 第三个月：2；
// 第四个月：3；
// 第五个月：5；
// 第六个月：8；
// 第七个月：13
// f(n) = f(n-1) + f(n-2)  第n个月的兔子数应该等于第n-1个月+n-2个月
public class Fibonacci_series {
    public static void main(String[] args) {

        int month_n;  //代表第n个月
        int month_1 = 1;  //代表第n - 1 个月
        int month_2 = 0;  //代表第n - 2 个月

        Scanner input = new Scanner(System.in);
        System.out.println("请输入月份：");
        int n = input.nextInt();

        for (int month = 1;month <= n;month++){
            if(month == 1){
                System.out.println("第" + month + "个月" + "有1只兔子");
            }else {

                month_n = month_1 + month_2;     //第n个月的兔子数等于第n-1个月+第n-2个月的兔子数
                month_2 = month_1;               //进行循环赋值，将第n-2个月的兔子数赋值个下个月的第n-1个月的兔子数
                month_1 = month_n;               //同理，将第n-1个月的兔子数赋值个下个月的第n个月的兔子数
                System.out.println("第" + month + "个月" + "有" + month_n + "只兔子");
            }

//            举例：
//            #n = 2时
//            #第2个月：month_n= 0 + 1 = 1
//            #第2-2 = 0个月：month_2 = 0
//            #第2-1 = 1个月：month_1 = 1
//
//            #n = 3时
//            #第3个月：month_n = 1 + 1 = 2
//            #第3 - 2 = 1个月：month_2 = 1
//            #第3 - 1 = 2个月：month_1 = 2
        }
    }
}
