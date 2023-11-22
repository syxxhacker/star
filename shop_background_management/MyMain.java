import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        GoodsManagerlmpl goodsManager = new GoodsManagerlmpl();
        char option = ' ';

        System.out.println("----------------------------------------------");
        System.out.println("   商品后台管理系统   ");
        System.out.println("         版本号：v1.0");
        System.out.println("         作者：萧萧");
        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        //用户可以反复选择要执行的操作，知道其选择退出
        do{
            System.out.println("请选择你要执行的操作：");
            System.out.println("1.添加商品  2.修改商品  3.删除商品  4.查找商品  5.查找价格  6.查看所有商品  7.退出后台");
            String myoption = scanner.next();
            option = myoption.toCharArray()[0];

            switch (option){
                case '1': goodsManager.add_goods(); break;
                case '2': goodsManager.update_goods(); break;
                case '3': goodsManager.del_goods(); break;
                case '4': System.out.println(goodsManager.find_name()); break;
                case '5': System.out.println(goodsManager.find_price()); break;
                case '6': System.out.println(goodsManager.find_all()); break;
                case '7': System.out.println("正在退出....."); break;
                default: System.out.println("你选择的功能编号不正确，请重新选择！");
            }
        }while(option!='7');

    }
}
