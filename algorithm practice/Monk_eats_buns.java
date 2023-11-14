public class Monk_eats_buns {
    public static void main(String[] args) {
        int food = 100;    //馒头数
        int big_monk = 0;  //大和尚数量
        int small_monk = 0;//小和尚数量

        while (food != 0){
            //大和尚一个人吃三个馒头，food-3，大和尚人数big_person+1
            food -= 3;
            big_monk += 1;

            //此代码可以查看每次大和尚吃完剩下多少个馍，大和尚人数有多少个
//            System.out.println("还剩:" + food + "个馍");
//            System.out.println("大和尚:" + big_person);

            //小和尚三个人吃一个馒头，food-1,小和尚人数small_person+3
            food -= 1;
            small_monk += 3;

            //此代码可以查看小和尚吃完还剩多少个馍，小和尚有多少个
//            System.out.println("还剩:" + food + "个馍");
//            System.out.println("小和尚:" + small_person);
//            System.out.println("-----------------------------------------------------");
        }
        System.out.println("大和尚一共有：" + big_monk + "个");
        System.out.println("小和尚一共有：" + small_monk + "个");
    }
}
