package hmJava3.GrokaemAlgoritms.dz.homework3;

import java.util.Arrays;

public class MyDeque<Item> {

    private Item[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int head = 0;
    private int tail = -1;

    public MyDeque(){
        list = (Item[]) new Object[DEFAULT_CAPACITY];
    }

    public MyDeque(int capacity){
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

    public void addFirst(Item item){

        if(isFull()){
            throw new RuntimeException("MyDeque is Full");
        }else {

            if(head > 0){
                head--;
            }else {
                head = list.length -1;
            }

            list[head] = item;
            size++;

            if(size == 1){
                tail = head;
            }

        }

    }

    public void addLast(Item item){

        if(isFull()){
            throw new RuntimeException("MyDeque is Full");
        }else {

            if(tail == list.length -1){
                tail = 0;
            }else {
                tail++;
            }

            list[tail] = item;
            size++;

            if(size == 1){
                head = tail;
            }

        }

    }

    public Item peekFirst(){

        if(isEmpty()){
            throw new RuntimeException("MyDeque is Empty");
        }else {
            return list[head];
        }

    }

    public Item peekLast(){

        if(isEmpty()){
            throw new RuntimeException("MyDeque is Empty");
        }else {
            return list[tail];
        }

    }

    public Item removeFirst(){

        if(isEmpty()){
            throw new RuntimeException("MyDeque is Empty");
        }else {

            Item item = list[head];
            list[head] = null;
            if(head == list.length-1){
                head = 0;
            }else {
                head++;
            }
            size--;

            return item;

        }

    }

    public Item removeLast(){

        if(isEmpty()){
            throw new RuntimeException("MyDeque is Empty");
        }else {

            Item item = list[tail];
            list[tail] = null;
            if(tail == 0){
                tail = list.length-1;
            }else {
                tail--;
            }
            size--;

            return item;
        }

    }

    @Override
    public String toString() {
        return "MyDeque{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }
}
