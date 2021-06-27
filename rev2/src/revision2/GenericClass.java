package revision2;

public class GenericClass<T> {
    public T[] array;

    public GenericClass(T[] array) {
        this.array = array;
    }

    public <T> T[] getArray(int size) {
        T[] array = (T[])new Object[size];
        return array;
    }
}
