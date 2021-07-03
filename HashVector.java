import java.util.Arrays;

public class HashVector<T> {
    private Object[] data;
    private int size;

    public HashVector(int size) {
        this.size = size;
        this.data = new Object[size];

        for (int i = 0; i < data.length; i++)
            data[i] = new HashList<T>();
    }

    public void add(T elem) {
        if (data.length == size)
            data = Arrays.copyOf(data, data.length * 2);
        data[size++] = elem;
    }

    public T get(int index) {
        return (T) data[index];
    }

}
