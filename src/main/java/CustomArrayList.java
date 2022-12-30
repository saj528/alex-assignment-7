import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];

    private int size = 0;

    @Override
    public boolean add(T item) {

        arraySizeCheck();

        items[size] = item;
        size++;
        return true;

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {

        return (T) items[index];

    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {

        indexOutOfBounds(index);

        arraySizeCheck();

        for (int i = getSize() - 1; i >= index && i < items.length; i--) {
            items[i + 1] = items[i];
        }
        items[index] = item;
        size++;
        return true;
    }


    @Override
    public T remove(int index) throws IndexOutOfBoundsException {

        indexOutOfBounds(index);

        T removedElement = (T) items[index];

        for (int i = index; i < (items.length - 1); i++) {
            items[i] = items[i + 1];

        }
        items[items.length - 1] = null;
        size--;
        return removedElement;
    }

    private void indexOutOfBounds(int index) {
        if (index > getSize() || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
    }

    private void arraySizeCheck() {
        if (getSize() == items.length) {
            items = Arrays.copyOf(items, items.length * 2);
        }
    }


}
