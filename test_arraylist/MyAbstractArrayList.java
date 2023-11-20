import java.util.Iterator;
import java.util.ListIterator;

public abstract class MyAbstractArrayList extends MyAbstractCollection implements MyList{
    public ListIterator<Object> listIterator(int i) {
        return listIterator(0);
    }

    @Override
    public abstract Iterator<Object> iterator();

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

//    @Override
//    public void sort() {
//        MyList.super.sort();
//    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        ListIterator<Object> it = listIterator(0);
        if (o==null) {
            while (it.hasNext())
                if (it.next()==null)
                    return it.previousIndex();
        } else {
            while (it.hasNext())
                if (o.equals(it.next()))
                    return it.previousIndex();
        }
        return -1;
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
}
