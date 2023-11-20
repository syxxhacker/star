import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> myint = new ArrayList<Integer>();
        //add一次，就产生了10长度的数组，所以这里可以取到第四个元素
        for(int i = 1;i < 10;i++){
            myint.add(i);
        }
        System.out.println("删除前：" + Arrays.toString(myint.toArray()));
        myint.remove(3);
//        System.out.println(myint.get(7));
        System.out.println("删除后：" + Arrays.toString(myint.toArray()));

        //修改
        myint.set(5,100);
        System.out.println("修改后：" + myint);

        //查找数组中值的下标，indexOf
        System.out.println(myint.indexOf(null));

        //取子列表，subList
        System.out.println(myint.subList(2,5));

        //清空，clear
        myint.clear();
        System.out.println("清空后：" + myint);
    }
}
