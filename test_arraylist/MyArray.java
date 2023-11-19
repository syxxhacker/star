import java.util.Arrays;

public class MyArray {
    private Object[] arr = {};
    private int size = 0;
    public MyArray(){
    }
    public void add(Object obj){
        arr = Arrays.copyOf(arr,10);
        arr[size] = obj;
        this.size++;
    }
    public Object get(int index){
        if (index>=size){
            System.out.println("Exception in thread \"main\" java.lang.IndexOutOfBoundsException");
        }else {
            return arr[index];
        }
        return new Exception("Exception in thread \"main\" java.lang.IndexOutOfBoundsException");
    }

    //仿写删除方法remove
    public Object remove(int index){
        if (index >= this.size){
            return new Exception("Exception in thread \"main\" java.lang.IndexOutOfBoundsException");
        }
        //记录删除的元素
        Object oldvalue = this.arr[index];
        //移动元素的位数
        int numMoved = size - index - 1;
        //如果移动的不是最后一位，数组往前移动一位
        if (numMoved > 0){
            //参数分别是：复制前的数组，复制的索引，复制后的数组，复制后的索引，移动元素的个数。
            System.arraycopy(this.arr,index+1,this.arr,index,numMoved);
        }
        //所有的元素都往前复制的，所以要把最后的元素删除，所以size--；
        size--;
        arr[size] = null;
        return oldvalue;
    }


    @Override
    public String toString() {
        Object[] objects = new Object[this.size];
       for (int i = 0;i < arr.length;i++){
           if (arr[i]!=null){
               objects[i] = arr[i];
           }
       }
       return Arrays.toString(objects);
    }
}
