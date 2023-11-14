import java.util.Arrays;
import java.util.Scanner;

public interface Binary_search {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3,6,7,8,9,12,12,36,45,45,45};
        //先对数组进行排列，使用冒泡排序
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
        System.out.println(Arrays.toString(arr));

        //下面是查找
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要查找的数字：");
        int n= input.nextInt();
        //定义初始末位置
        int first_index = 0;
        int last_index = arr.length - 1;
        int mid_index = (first_index + last_index) / 2;

        //while循环控制比较次数，只要查找的数字不等于n，就一直循环
        while (arr[mid_index] != n){
            if (arr[mid_index] > n){
                //当要查找的数字比中间数小的时候，就应该在前面的数之中进行查找，所以这里末位置变为mid_index-1
                last_index = mid_index - 1;
            }else if (arr[mid_index] < n){
                //当要查找的数字比中间数大的时候，就应该在后面的数之中进行查找，所以这里起始位置变为mid_index+1
                first_index = mid_index + 1;
            }
            if (first_index>=last_index){
                break;
            }
            //将新的始末位置进相加除以2，就是新的中间值，再进行查找比较
            mid_index = (first_index + last_index) / 2;
        }
        if (arr[mid_index] == n){
            System.out.println(mid_index);
            //输出结果
            System.out.println(n + "的位置在数组中是第：" + mid_index + "位");
        }else{
            System.out.println("你查找的数字不存在！");
        }

        //当一个数组有几个相同的数时，先找到第一个数，也就是上面找到的数，再往前查找，如果前一位和这个数相等，则将这个数位置输出，然后继续往前找
       for(int i=mid_index-1;i>=first_index;i--){
           if (arr[i]==n){
               System.out.println(n + "的位置在数组中是第：" + i + "位");
           }
       }
        //当一个数组有几个相同的数时，先找到第一个数，也就是上面找到的数，再往后查找，如果后一位和这个数相等，则将这个数位置输出，然后继续往后找
        for(int i=mid_index+1;i<=last_index;i++){
            if (arr[i]==n){
                System.out.println(n + "的位置在数组中是第：" + i + "位");
            }
        }

    }
}
