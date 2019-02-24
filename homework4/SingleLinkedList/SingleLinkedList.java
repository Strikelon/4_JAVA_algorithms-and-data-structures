package hmJava3.GrokaemAlgoritms.dz.homework4.SingleLinkedList;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class SingleLinkedList implements Iterable<SingleLink>{

    int size;
    SingleLink first;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insert (String task){
        SingleLink singleLink = new SingleLink(task);
        if(!isEmpty()){
            singleLink.setNext(first);
        }
        first = singleLink;
        size++;
    }

    public String delete(){

        if(isEmpty()){
            return null;
        }
        SingleLink deleteLink = first;
        if(size == 1){
            first = null;
        }else {
            first = first.getNext();
        }
        size--;
        return deleteLink.getTask();
    }

    public String getFirst(){
        if(first == null || first.getTask() == null){
            return null;
        }
        return first.getTask();
    }

    public SingleLink getFirstLink(){
        return first;
    }

    public int indexOf(String task){
        if(isEmpty()){
            return -1;
        }
        int index = 0;
        SingleLink currentLink = first;
        while (true){
            if(currentLink.getTask().equals(task)){
                return index;
            }else {
                if(currentLink.getNext() == null){
                    return -1;
                }else {
                    currentLink = currentLink.getNext();
                    index++;
                }
            }
        }
    }

    public boolean delete(String task){
        int index = indexOf(task);
        if(index == -1){
            return false;
        }else {
            int i=0;
            SingleLink previusLink = null;
            SingleLink currentLink = first;
            while(i<index){
                previusLink = currentLink;
                currentLink = currentLink.getNext();
                i++;
            }
            if(previusLink == null){
                first = currentLink.getNext();
            }else {
                previusLink.setNext(currentLink.getNext());
            }
            size--;
            return true;
        }
    }

    public boolean contains(String task){
        return indexOf(task) != -1;
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "SingleLinkedList is EMPTY! Size = 0";
        }
        SingleLink currentSingleLink = first;
        StringBuilder stringBuilder = new StringBuilder();
        while (true){
            stringBuilder.append(currentSingleLink.getTask()).append(" ");
            if(currentSingleLink.getNext()==null){
                break;
            }else{
                currentSingleLink = currentSingleLink.getNext();
            }
        }
        stringBuilder.append(" | Size = " + size);
        return stringBuilder.toString();
    }

    private class Iter implements Iterator<SingleLink> {

        SingleLink current = new SingleLink(first);

        @Override
        public boolean hasNext() {
            return current.getNext() != null;
        }

        @Override
        public SingleLink next() {
            current = current.getNext();
            return current;
        }
    }

    @NotNull
    @Override
    public Iterator<SingleLink> iterator() {
        return new Iter();
    }
}
