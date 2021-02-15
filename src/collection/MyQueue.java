package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class MyQueue<T> implements Queue<T> {

    private Object[] items = new Object[0];

    @Override
    public int size() {
        return items.length;
    }

    @Override
    public boolean isEmpty() {
        return items.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object item : items) {
            if (item.equals(o)) {
                return true;
            }
        }
        return false;
    }

    //[] -> [E1]


    //[E1] -> [E2, E1]

    @Override
    public boolean add(T t) {
        Object[] newItems = new Object[items.length + 1];
        newItems[0] = t;
        for (int i = 0; i < items.length; i++) {
            newItems[i + 1] = items[i];
        }
        items = newItems;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        int indexToRemove = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(o)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            return false;
        }
        //indexToRemove = 2
        //  [1, 8, 5, 9, 7] -> [1, 8, 9, 7]
        Object[] newItems = new Object[items.length - 1];
        for (int i = 0; i < indexToRemove; i++) {
            newItems[i] = items[i];
        }
        for (int i = indexToRemove + 1; i < items.length; i++) {
            newItems[i - 1] = items[i];
        }
        items = newItems;

        return true;
    }

    @Override
    public void clear() {
        items = new Object[0];
    }

    @Override
    public boolean offer(T t) {
        return add(t);
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    ///////////////////////////////////////////////////////////////////////
    //Not implement
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    //Not implement
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    //Not implement
    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    //Not implement
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    //Not implement
    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    //Not implement
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    //Not implement
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (Object item : items) {
            stringBuilder.append(item.toString() + ", ");
        }
        stringBuilder.append(']');

        return stringBuilder.toString();
    }
}
