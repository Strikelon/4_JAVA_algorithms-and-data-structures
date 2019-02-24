package hmJava3.GrokaemAlgoritms.dz.homework4.LinkedQueue;

import hmJava3.GrokaemAlgoritms.dz.homework4.TwoLinkedList.TwoLinkedList;

public class LinkedQueue {

    TwoLinkedList twoLinkedList = new TwoLinkedList();

    public void enqueue(String task){
        twoLinkedList.insertFirst(task);
    }

    public String dequeue(){
        return twoLinkedList.deleteLast();
    }

    public String peek(){
        return twoLinkedList.getFirst();
    }

    public int size(){
        return twoLinkedList.size();
    }

    public boolean isEmpty(){
        return twoLinkedList.isEmpty();
    }

    @Override
    public String toString() {
        return "LinkedQueue{" + twoLinkedList +
                '}';
    }
}
