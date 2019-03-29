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

        // start at end of size of array, go through array until you get to desired position, insert at position
        for (int i = size; i > pos; i--){
            arr[i] = arr[i - 1];
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
        else{
            arr[size] = t;
            size++;
        }
    }

    // double array
    public void growarray(){
        // create new array double the size of original arr
        // add everything to temp arr, make them equal
        T[] temparr = (T[]) new Object[arr.length*2];
        for(int i = 0; i < arr.length; i++){
            temparr[i] = arr[i];
        }
        arr = temparr;
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

    // gets data from specific position
    public T get(int position){
        return arr[position];
    }
}