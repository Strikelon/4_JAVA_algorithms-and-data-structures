package hmJava3.GrokaemAlgoritms.dz.homework4.LinkedStack;

import hmJava3.GrokaemAlgoritms.dz.homework4.SingleLinkedList.SingleLinkedList;

public class LinkedStack {

    SingleLinkedList linkedStack = new SingleLinkedList();

    public void push(String task){
        linkedStack.insert(task);
    }

    public String pop(){
        return linkedStack.delete();
    }

    public String peek(){
        return linkedStack.getFirst();
    }

    public int size(){
        return linkedStack.size();
    }

    public boolean isEmpty(){
        return linkedStack.isEmpty();
    }

    @Override
    public String toString() {
        return "LinkedStack{" + linkedStack +
                '}';
    }
}
