package hmJava3.GrokaemAlgoritms.dz.homework3;

import java.util.Arrays;

public class MyQueue<Item> {

    private Item[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;
    private final double LOADFACTOR = 0.75;

    public MyQueue(){
        list = (Item[]) new Object[DEFAULT_CAPACITY];
    }

    public MyQueue(int capacity){
        if(capacity <=0){
            throw new RuntimeException("capacity can not be <=0");
        }else {
            list = (Item[]) new Object[capacity];
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == list.length;
    }

    public Item peek(){
        if(isEmpty()){
            throw new RuntimeException("MyQueue is empty");
        }else {
            return list[begin];
        }
    }

    private boolean isOverloaded(){
        return size >= list.length * LOADFACTOR;
    }

    public void insert(Item item) {
        if (isOverloaded()) {
            increaseQueue(list.length * 2);
        }
        size++;
        list[end] = item;
        end = newIndex(end);
    }

    public Item remove(){
        Item item = peek();
        size--;
        list[begin] = null;
        begin = newIndex(begin);
        return item;
    }

    private int newIndex(int index){
        return (index+1)%list.length;
    }

    private void increaseQueue(int newSize){
        if(newSize <= list.length){
            throw new RuntimeException("resize(): newSize can not be <= list.length");
        }else {
            Item tempArray[] = (Item[]) new Object[newSize];
            int i = begin;
            int tempIndex = 0;
            while (i != end){
                tempArray[tempIndex] = list[i];
                tempIndex++;
                i = newIndex(i);
            }
            list = tempArray;
            begin = 0;
            end = tempIndex;
        }
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                ", begin=" + begin +
                ", end=" + end +
                '}';
    }
}
