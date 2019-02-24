package hmJava3.GrokaemAlgoritms.dz.homework4.LinkedQueue;

public class TestLinkedQueue {

    public static void main(String[] args){

        LinkedQueue linkedQueue = new LinkedQueue();

        System.out.println(linkedQueue.isEmpty());

        linkedQueue.enqueue("Проснуться");
        linkedQueue.enqueue("Позавтракать");
        linkedQueue.enqueue("Почистить зубы");
        linkedQueue.enqueue("Пойти на работу");

        System.out.println(linkedQueue);

        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.dequeue());

    }

}
