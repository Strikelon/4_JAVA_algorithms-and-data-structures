package hmJava3.GrokaemAlgoritms.dz.homework3;

public class TestMyDeque {
    public static void main(String[] args){

        MyDeque<Integer> myDeque = new MyDeque<>();

        System.out.println(myDeque);

        myDeque.addFirst(1);
        myDeque.addFirst(2);
        myDeque.addFirst(3);
        myDeque.addFirst(4);
        System.out.println(myDeque);

        myDeque.removeLast();
        myDeque.removeLast();
        System.out.println(myDeque);

        myDeque.addFirst(5);
        myDeque.addLast(0);
        myDeque.addLast(-1);
        myDeque.addLast(-2);
        myDeque.addLast(-3);
        System.out.println(myDeque);

        myDeque.removeFirst();
        System.out.println(myDeque);




    }
}
