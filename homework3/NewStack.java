package hmJava3.GrokaemAlgoritms.dz.homework3;

import java.util.Arrays;

public class NewStack<Item> {

    private Item[] array;
    private int length;
    private final int USER_CAPACITY;
    private final int DEFAULT_CAPACITY = 10;
    private final double LOADFACTOR = 0.75;
    private final double SHORTFACTOR = 0.25;

    public NewStack(){
        array = (Item[]) new Object[DEFAULT_CAPACITY];
        USER_CAPACITY = -1;
    }

    public NewStack(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException("Length must not be <= 0");
        }else {
            array = (Item[]) new Object[capacity];
            USER_CAPACITY = capacity;
        }
    }

    public int size(){
        return length;
    }

    public Item peek(){
        if(!isEmpty()) {
            return array[length - 1];
        }else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public boolean isFull(){
        return length == array.length;
    }

    private boolean isOverloaded(){
        return length > array.length * LOADFACTOR;
    }

    private void increaseSize(int newSize){

        if(newSize > array.length){
            Item[] tempArr = (Item[]) new Object[newSize];
            System.arraycopy(array, 0, tempArr, 0, array.length);
            array = tempArr;
        }else {
            throw new RuntimeException("newSize cannot be less than or equal to array.length");
        }

    }

    //Задумка в том, что если пользователь ввел какую-то капасити, то при уменьшении стека,
    //его размер не может быть меньше этой капасити

    private boolean isShortFall(){

        if(USER_CAPACITY == -1){
            return length < array.length * SHORTFACTOR;
        }else {
            return (length < array.length * SHORTFACTOR) && (length > USER_CAPACITY);
        }
    }

    private void reduceSize(int newSize){
        if(newSize <= length){
            throw new RuntimeException("newSize cannot be less than or equal to size");
        }else {
            if(USER_CAPACITY == -1){

                Item[] tempArr = (Item[]) new Object[Math.max(DEFAULT_CAPACITY, newSize)];
                System.arraycopy(array, 0, tempArr, 0, Math.max(DEFAULT_CAPACITY, newSize));
                array = tempArr;

            }else {

                Item[] tempArr = (Item[]) new Object[Math.max(DEFAULT_CAPACITY, newSize)];
                System.arraycopy(array, 0, tempArr, 0, Math.max(DEFAULT_CAPACITY, newSize));
                array = tempArr;

            }
        }
    }

    public void push(Item item){

        if(isOverloaded()){
            int lastLength = length;
            int lastArraylength = array.length;
            increaseSize(array.length * 2);
//            System.out.println("increaseSize : Last size: " + lastLength + " Last Array length: " + lastArraylength +
//            " New Array length: " + array.length);
        }
        array[length] = item;
        length++;

    }

    public Item pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }else {

            if(isShortFall()){
                int lastLength = length;
                int lastArraylength = array.length;
                reduceSize(array.length /2);
//                System.out.println("reduceSize : Last size: " + lastLength + " Last Array length: " + lastArraylength +
//                        " New Array length: " + array.length);
            }

            Item item = array[length-1];
            length--;
            array[length] = null;
            return item;
        }
    }

    @Override
    public String toString() {
        return "NewStack{" +
                "array=" + Arrays.toString(array) +
                ", length=" + length +
                '}';
    }
}
