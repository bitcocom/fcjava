package fc.java.model2;

public class ObjectArr<T> {
    private T[] array;
    private int size;
    public ObjectArr(int size){
        array=(T[])new Object[size];
    }

    public void set(int index, T value){
        array[index]=value;
        size++;
    }

    public T get(int index){
        return array[index];
    }

    public int size(){
        return size;
    }
}
