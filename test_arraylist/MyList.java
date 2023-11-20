import java.util.Arrays;
import java.util.Iterator;

public interface MyList {
    int size();

    //判断为空
    boolean isEmpty();

    boolean contains(Object o);

    Iterator<Object> iterator();

    //转换为数组
    Object[] toArray();

    //添加元素的方法
    boolean add(Object e);

    //移除元素的方法
    boolean ramove(Object o);

    //移除所有元素
    boolean removeAll(MyCollection c);

    //清空所有元素
    void clear();

    //判断相等
    boolean equals(Object o);

    int hashCode();

    default void sort(Object[] arr){
        Arrays.sort(arr);
    }

    Object get(int index);

    Object set(int index);

    void add(int index,Object element);

    Object remove(int index);

    int indexOf(Object o);

}
