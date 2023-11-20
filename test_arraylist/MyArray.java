import java.util.Arrays;

public class MyArray {
    private Object[] arr = {};
    private int size = 0;
    public MyArray(){
    }

    //仿写添加元素的方法
    public void add(Object obj){
        arr = Arrays.copyOf(arr,10);
        arr[size] = obj;
        this.size++;
    }

    //仿写修改元素的方法
    public Object set(int index,Object newvalue){
        if(index >= size){
            //超出范围则返回异常提示
            return new Exception("Exception in thread \"main\" java.lang.IndexOutOfBoundsException");
        }else {
            //先把原值取出，最后再返回
            Object oldvalue = this.arr[index];
            //使用设置的新值修改原值
            this.arr[index] = newvalue;
            //再返回旧值
            return oldvalue;
        }
    }

    //仿写获取元素的方法
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

    //仿写清空元素的方法
    public void clear(){
        for (int i = 0;i < size;i++){
            this.arr[i] = null;
        }
        size = 0;
    }

    //仿写查找数组中某个值的下标的数组
    public int indexOf(Object value){
        if(value == null){
            for (int i = 0;i < size;i++){
                this.arr[i] = null;
                return i;
            }
        }else {
            for (int i = 0;i < size;i++){
                if(value.equals(arr[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    //


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

