package hmJava3.GrokaemAlgoritms.dz.homework4.TwoLinkedList;

public class TestTwoLinkedList {

    public static void main(String[] agrs){

        TwoLinkedList twoLinkedList = new TwoLinkedList();

        System.out.println(twoLinkedList);

        twoLinkedList.insertFirst("Задание1");
        twoLinkedList.insertFirst("Задание2");
        twoLinkedList.insertFirst("Задание3");
        twoLinkedList.insertFirst("Задание4");
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.deleteFirst();
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.deleteFirst();
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.deleteFirst();
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.deleteFirst();
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.insertLast("Задание1");
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.insertLast("Задание2");
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.insertFirst("Задание0");
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.deleteLast();
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.deleteLast();
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.deleteLast();
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.insertLast("TASK0");
        twoLinkedList.insertLast("TASK1");
        twoLinkedList.insertLast("TASK2");
        twoLinkedList.insertLast("TASK3");
        twoLinkedList.insertLast("TASK4");
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.delete("TASK0");
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.delete("TASK4");
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        twoLinkedList.delete("TASK2");
        System.out.println(twoLinkedList);
        System.out.println("First: " + twoLinkedList.getFirst());
        System.out.println("Last: " + twoLinkedList.getLast());

        for (TwoLink twoLink : twoLinkedList){
            System.out.println(twoLink.getTask());
        }
    }

}
