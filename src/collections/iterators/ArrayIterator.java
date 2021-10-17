package collections.iterators;

import java.util.Iterator;

class ArrayIterator<T> implements Iterator<T> {
    private final T[] data;
    private int index = 0;  // Невидимое снаружи поле, реальный счетчик.

    public ArrayIterator(T[] data) {  // Конструктор, получает себя и сохраняет
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public T next() {
        return data[index++];
    }
}
