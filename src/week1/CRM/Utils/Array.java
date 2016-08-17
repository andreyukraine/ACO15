package week1.CRM.Utils;

import week1.parking.Ticket;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by IT on 14.08.2016.
 */
public class Array {


    public static final int DEFAULT_ARRAY_SIZE = 13;
    private Object[] array;
    private int index;

    public Array() {
        array = new Object[DEFAULT_ARRAY_SIZE];
    }

    public Object get(int index){
        return null;
    }
    public void set(int index, Object obj){
        array[index] = obj;
    }

    public boolean add(Object obj){
        ensureCapacity();
        array[index++] = obj;
        return true;
    }
    private void ensureCapacity() {
        if(index >= array.length){
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array,0,newArray,0,array.length);
           array = newArray;
        }
    }
    public Object[] getAll(){
        Object[] retArr = Arrays.copyOf(array,index);
        return retArr;
    }
}
