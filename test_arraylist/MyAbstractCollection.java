import java.util.Iterator;
import java.util.Objects;

public abstract class MyAbstractCollection implements MyCollection{
    public abstract Iterator<Object> iterator();
    @Override
    public int size() {
        return 0;
    }

    //判断为空
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o){
        Iterator<Object> it = iterator();
        if (o==null) {
            while (it.hasNext())
                if (it.next()==null)
                    return true;
        } else {
            while (it.hasNext())
                if (o.equals(it.next()))
                    return true;
        }
        return false;
    }

    //转换为数组
    @Override
    public abstract Object[] toArray();

    //添加元素的方法
    @Override
    public boolean add(Object e) {
        throw new UnsupportedOperationException();
    }

    //移除元素的方法
    @Override
    public boolean ramove(Object o) {
        Iterator<Object> it = iterator();
        if (o==null) {
            while (it.hasNext()) {
                if (it.next()==null) {
                    it.remove();
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (o.equals(it.next())) {
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }

    //移除所有元素
    @Override
    public boolean removeAll(MyCollection c) {
        Objects.requireNonNull(c);
        boolean modified = false;
        Iterator<?> it = iterator();
        while (it.hasNext()) {
            if (c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }

    //清空元素
    @Override
    public void clear() {
        Iterator<Object> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override
    public String toString() {
        Iterator<Object> it = iterator();
        if (!it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (; ; ) {
            Object e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (!it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }

}
