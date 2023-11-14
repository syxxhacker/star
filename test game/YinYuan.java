import java.util.Scanner;

public class YinYuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入男生名字
        System.out.println("下面测试两个人的姻缘指数：");
        System.out.println("请输入男生名字：");
        String boy = input.next();
        //输入女生名字
        System.out.println("请输入女生名字：");
        String girl = input.next();
        //获取随机数
        if (boy.equals("萧顺元") && girl.equals("傅榆芬") ){
            System.out.println(boy + "和" + girl + "的姻缘指数为：100%");
        }
        else {
            System.out.println(boy + "和" + girl + "的姻缘指数为：");
            System.out.println(Math.round(Math.random() * 100) + "%");
        }


    }
}
