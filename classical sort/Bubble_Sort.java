import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int arr_temp;
        //i控制比较次数
        for (int i = 1;i <= arr.length;i++){
            //j遍历数组并进行比较
            for (int j = 0;j <= arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    arr_temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = arr_temp;
                }
            }
        }
        //输出结果
        System.out.println(Arrays.toString(arr));
    }
}
