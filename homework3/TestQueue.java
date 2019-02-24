package hmJava3.GrokaemAlgoritms.dz.homework3;

import java.util.Arrays;

public class TestQueue {

    public static void main(String[] args){

        MyQueue<Integer> myQueue = new MyQueue<>(5);

        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);
        System.out.println(myQueue);

        myQueue.remove();
        myQueue.remove();

        myQueue.insert(4);
        myQueue.insert(5);
        System.out.println(myQueue);

        myQueue.insert(6);
        System.out.println(myQueue);
        myQueue.insert(7);
        System.out.println(myQueue);

        myQueue.insert(8);
        myQueue.insert(9);
        myQueue.insert(10);
        System.out.println(myQueue);

        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        System.out.println(myQueue);

        myQueue.insert(11);
        myQueue.insert(12);
        myQueue.insert(13);
        System.out.println(myQueue);

        myQueue.insert(14);
        System.out.println(myQueue);


    }

}
