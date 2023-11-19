import java.util.Arrays;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        //ArrayList底层实现方法
        String[] arr = {};
        int size = 0;
        //copyOf给数组扩容
        String[] myarr = Arrays.copyOf(arr,10);
        //只要传入了数据，size++
        size++;
        myarr[0] = "10";
        size++;
        myarr[1] = "20";
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入元素的下标：");
        try{
            int myindex = scanner.nextInt();
            if(myindex > size){
                System.out.println("Exception in thread \"main\" java.lang.IndexOutOfBoundsException");
            }else {
                System.out.println(Arrays.toString(myarr));
            }
        }catch (Exception e){
            System.out.println("Exception in thread \"main\" java.lang.IndexOutOfBoundsException");
        }
//        System.out.println(Arrays.toString(myarr));
    }
}

