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

        return false;
    }

    @Override
    public boolean add(T t) {
        //TODO..
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(T t) {
        return false;
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
}
