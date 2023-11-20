public interface MyCollection {

    int size();

    //判断为空
    boolean isEmpty();

    boolean contains(Object o);

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
}
