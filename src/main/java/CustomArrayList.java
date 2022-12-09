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

        for (int i = getSize(); i >= index; i--) {
            items[i + 1] = items[i];
        }
        items[index] = item;
        size++;
        return true;
    }


    @Override
    public T remove(int index) throws IndexOutOfBoundsException {

        T removedElement = (T) items[index];

        for (int i = 0; i < (size - index); i++) {
            items[index + i] = items[index + i + 1];

        }
        size--;
        return removedElement;
    }

    private void arraySizeCheck() {
        if (getSize() == items.length) {
            items = Arrays.copyOf(items, items.length * 2);
        }
    }


}
