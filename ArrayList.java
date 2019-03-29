import java.util.*;

public class ArrayList<T> implements List<T> {
    
    T arr[];
    int size;

    public ArrayList(){
        arr = (T[]) new Object[10];
        size = 0;
    }

    // add item to position in list, if full, double array 
    public void add(int position, T t){
        if(size == arr.length){
            growarray();
        }
        arr[position] = t;
        size++;
    }

    // returns size
    public int size(){
        return size;
    }

    // add item to end of list, if full, double array
    public void add(T t) {
        if(size == arr.length){
            growarray();
        }
        arr[size++] = t;
    }

    // double array
    public void growarray(){
        arr = Arrays.copyOfRange(arr, 0, arr.length*2);
    }

    // remove at position
    public T remove(int position){
        T removed = arr[position];
        size--;
        for(int i = position; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        return removed;
    }

    // gets info from specific position
    public T get(int position){
        return arr[position];
    }
}