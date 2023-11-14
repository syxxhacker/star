public class Monky_eat_peach {
    public static void main(String[] args) {
        //第十天，还剩一个
        int peach_sum = 1;
        int day;

        //因为第十天还剩一个，所以从第九天开始算，算出剩下每天有多少个
        for (day = 9;day >= 1;day--){
            peach_sum = (peach_sum + 1) * 2;
            System.out.println("第" + day + "天：" + peach_sum);
        }
        System.out.println(peach_sum);
    }
}
