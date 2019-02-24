package hmJava3.GrokaemAlgoritms.dz.homework3;

import java.util.Arrays;

public class MyPriorityQueue <Item extends Comparable> {

    private Item[] list;
    private final int DEFAULT_CAPACITY = 10;
    private final double LOADFACTOR = 0.75;
    private int size;

    public MyPriorityQueue(int capacity) {
        if (capacity <= 0) {
            throw new RuntimeException("capacity can not be <=0");
        } else {
            list = (Item[]) new Comparable[capacity];
        }
    }

    public MyPriorityQueue() {
        list = (Item[]) new Comparable[DEFAULT_CAPACITY];
    }

    public void insert(Item item) {
        if (isOverloaded()) {
            increaseQueue(list.length * 2);
        }
        list[size] = item;
        size++;
        int i = size - 1;
        while ((i > 0) && (list[i].compareTo(list[i - 1]) < 0)) {
            swap(i, i - 1);
            i--;
        }
    }

    public Item remove() {
        if (isEmpty()) {
            throw new RuntimeException("MyPriorityQueue is empty");
        }
        Item temp = peek();
        size--;
        list[size] = null;
        return temp;
    }

    public Item peek() {
        return list[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private void swap(int index1, int index2) {
        Item temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    private boolean isOverloaded(){
        return size > list.length * LOADFACTOR;
    }

    private void increaseQueue(int newSize){

        if(newSize > list.length){
            Item[] tempArr = (Item[]) new Comparable[newSize];
            System.arraycopy(list, 0, tempArr, 0, list.length);
            list = tempArr;
        }else {
            throw new RuntimeException("newSize cannot be less than or equal to list.length");
        }

    }

    @Override
    public String toString() {
        return "MyPriorityQueue{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                '}';
    }
}
