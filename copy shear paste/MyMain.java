import java.io.IOException;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------");
        System.out.println("           复制粘贴剪切系统");
        System.out.println("                 作者：萧萧");
        System.out.println("                 版本：v1.0");
        System.out.println("------------------------------");

        Operation operation = new Operation();
        Scanner scanner = new Scanner(System.in);
//        operation.copy("F:\\javafile\\a.txt");
//        operation.paste("F:\\javafile\\paste\\1.txt");

        //定义option,这里用char类型，用来判断用户输入的是否是1-4，防止用户输入1-4之外的内容
        char option;
        //do while循环，运行时先执行一遍再判断循环条件
        do{
            //由用户自主选择要进行的操作
            System.out.println("请选择你要执行的操作：");
            System.out.println("1.复制   2.剪切   3.粘贴   4.退出");
            //定义一个String类型接收用户输入的内容
            String myoption = scanner.next();
            //将用户输入的内容转换为char类型
            option = myoption.toCharArray()[0];
            //判断用户的选择，从而实现相对应的操作
            switch (option){
                case '1': operation.copy();break;  //复制操作
                case '2': operation.shear();break; //剪切操作
                case '3': operation.paste();break; //粘贴操作
                case '4': System.out.println("正在退出......");break;  //用户输入4则退出
                default:  System.out.println("你选择的功能编号不正确，请重新选择！");  //如果用户输入1-4之外的内容，则提示重新输入
            }
        }while (option != '4');

    }
}
