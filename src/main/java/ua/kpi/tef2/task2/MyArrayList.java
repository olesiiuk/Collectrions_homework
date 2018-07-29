package ua.kpi.tef2.task2;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MyArrayList<E> extends ArrayList<E> {

    @Override
    public ListIterator<E> listIterator() {
        return super.listIterator();
    }

    @Override
    public Iterator<E> iterator() {
        return super.iterator();
    }

    @Override
    public E get(int index) {
        return super.get(index);
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Action is forbidden in this implementation");

    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Action is forbidden in this implementation");

    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Action is forbidden in this implementation");

    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Action is forbidden in this implementation");

    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Action is forbidden in this implementation");

    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Action is forbidden in this implementation");

    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        throw new UnsupportedOperationException("Action is forbidden in this implementation");

    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        throw new UnsupportedOperationException("Action is forbidden in this implementation");

    }

//    private class Itr implements Iterator<E> {
//        int cursor;       // index of next element to return
//        int lastRet = -1; // index of last element returned; -1 if no such
//        int expectedModCount = modCount;
//
//        // prevent creating a synthetic constructor
//        Itr() {}
//
//        public boolean hasNext() {
//            return cursor != size();
//        }
//
//        @SuppressWarnings("unchecked")
//        public E next() {
//            checkForComodification();
//            int i = cursor;
//            if (i >= size())
//                throw new NoSuchElementException();
//            Object[] elementData = elementData();
//            if (i >= elementData.length)
//                throw new ConcurrentModificationException();
//            cursor = i + 1;
//            return (E) elementData[lastRet = i];
//        }
//
//        public void remove() {
//            if (lastRet < 0)
//                throw new IllegalStateException();
//            checkForComodification();
//
//            try {
//                ArrayList.this.remove(lastRet);
//                cursor = lastRet;
//                lastRet = -1;
//                expectedModCount = modCount;
//            } catch (IndexOutOfBoundsException ex) {
//                throw new ConcurrentModificationException();
//            }
//        }
//
//        @Override
//        public void forEachRemaining(Consumer<? super E> action) {
//            Objects.requireNonNull(action);
//            final int size = size();
//            int i = cursor;
//            if (i < size) {
//                final Object[] es = elementData;
//                if (i >= es.length)
//                    throw new ConcurrentModificationException();
//                for (; i < size && modCount == expectedModCount; i++)
//                    action.accept(elementAt(es, i));
//                // update once at end to reduce heap write traffic
//                cursor = i;
//                lastRet = i - 1;
//                checkForComodification();
//            }
//        }
//
//        final void checkForComodification() {
//            if (modCount != expectedModCount)
//                throw new ConcurrentModificationException();
//        }
//    }
}
