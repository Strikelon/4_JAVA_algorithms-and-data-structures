package hmJava3.GrokaemAlgoritms.dz.homework3;

public class TestMyPriorityQueue {

    public static void main(String[] args){

        MyPriorityQueue<Integer> myPriorityQueue = new MyPriorityQueue<>(5);

        myPriorityQueue.insert(7);
        myPriorityQueue.insert(5);
        System.out.println(myPriorityQueue);


        myPriorityQueue.insert(6);
        myPriorityQueue.insert(3);
        System.out.println(myPriorityQueue);

        myPriorityQueue.insert(1);
        System.out.println(myPriorityQueue);


    }

}
