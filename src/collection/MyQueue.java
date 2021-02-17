package collection;

import java.util.*;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyQueue<T> implements Queue<T> { //T any type

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
            if (item == o) {
                return true;
            }
        }
        return false;
    }

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
    public boolean remove(Object o) { // ---------------------------------IMPROVED
        int indexToRemove = -1;
        for (int i = 0; i < items.length; i++) {
            if (o == items[i]) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            return false;
        }
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
        if (isEmpty()) {
            throw new NoSuchElementException("No head to remove!");
        }
        int headOfQueueIndex = items.length - 1;
        Object headOfQueue = items[headOfQueueIndex];
        Object[] newItems = new Object[items.length - 1];
        for (int i = 0; i < items.length - 1; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
        return (T) headOfQueue;
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            return null;
        }
        int headOfQueueIndex = items.length - 1;
        Object headOfQueue = items[headOfQueueIndex];
        Object[] newItems = new Object[items.length - 1];
        for (int i = 0; i < items.length - 1; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
        return (T) headOfQueue;
    }

    @Override
    public T element() {
        if (isEmpty()) {
            throw new NoSuchElementException("No head in queue!");
        }
        int headOfQueueIndex = items.length - 1;
        Object headOfQueue = items[headOfQueueIndex];
        return (T) headOfQueue;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        int headOfQueueIndex = items.length - 1;
        Object headOfQueue = items[headOfQueueIndex];
        return (T) headOfQueue;
    }

    @Override
    public String toString() { // ------------------------------------IMPROVED
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        int lastElement = items.length - 1;
        for (int i = 0; i < items.length ; i++) {
            if (lastElement == i) {
                stringBuilder.append(items[i].toString() + "");
            } else {
                stringBuilder.append(items[i].toString() + ", ");
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    //////////////////////////////////////////////////////////////////////////
    // Not implement
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    // Not implement
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public <T1> T1[] toArray(IntFunction<T1[]> generator) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super T> filter) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }


    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    @Override
    public Stream<T> stream() {
        return null;
    }

    @Override
    public Stream<T> parallelStream() {
        return null;
    }
}