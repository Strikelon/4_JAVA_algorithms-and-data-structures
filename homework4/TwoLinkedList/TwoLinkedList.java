package hmJava3.GrokaemAlgoritms.dz.homework4.TwoLinkedList;

import java.util.Iterator;

public class TwoLinkedList implements Iterable<TwoLink>{

    int size;
    TwoLink first;
    TwoLink last;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "TwoLinkedList is EMPTY! Size = 0";
        }
        TwoLink currentTwoLink = first;
        StringBuilder stringBuilder = new StringBuilder();
        while (true){
            stringBuilder.append("[").append(currentTwoLink.getTask()).append("(");
            if(currentTwoLink.getPrev() == null){
                stringBuilder.append("Prev: ").append(currentTwoLink.getPrev()).append(" ");
            }else {
                stringBuilder.append("Prev: ").append(currentTwoLink.getPrev().getTask()).append(" ");
            }
            if(currentTwoLink.getNext() == null){
                stringBuilder.append("Next: ").append(currentTwoLink.getNext()).append(")");
            }else {
                stringBuilder.append("Next: ").append(currentTwoLink.getNext().getTask()).append(")], ");
            }
            if(currentTwoLink.getNext()==null){
                break;
            }else{
                currentTwoLink = currentTwoLink.getNext();
            }
        }
        stringBuilder.append(" | Size = " + size);
        return stringBuilder.toString();
    }

    public int indexOf(String task){
        if(isEmpty()){
            return -1;
        }
        int index = 0;
        TwoLink currentLink = first;
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

    public boolean contains(String task){
        return indexOf(task) != -1;
    }

    public String getFirst(){
        if(first == null || first.getTask() == null){
            return null;
        }
        return first.getTask();
    }

    public void insertFirst (String task){
        TwoLink currentLink = new TwoLink(task);
        if(!isEmpty()){
            currentLink.setNext(first);
            currentLink.getNext().setPrev(currentLink);
        }else {
            last = currentLink;
        }
        first = currentLink;
        size++;
    }


    public String deleteFirst(){

        if(isEmpty()){
            return null;
        }
        TwoLink deleteLink = first;
        if(size == 1){
            first = null;
            last = null;
        }else {
            first = first.getNext();
            first.setPrev(null);
        }
        size--;
        return deleteLink.getTask();
    }

    public String getLast(){
        if(last == null || last.getTask() == null){
            return null;
        }
        return last.getTask();
    }

    public void insertLast (String task){
        TwoLink currentLink = new TwoLink(task);
        if(!isEmpty()){
            currentLink.setPrev(last);
            currentLink.getPrev().setNext(currentLink);
        }else {
            first = currentLink;
        }
        last = currentLink;
        size++;
    }

    public String deleteLast(){

        if(isEmpty()){
            return null;
        }
        TwoLink deleteLink = last;
        if(size == 1){
            first = null;
            last = null;
        }else {
            last = last.getPrev();
            last.setNext(null);
        }
        size--;
        return deleteLink.getTask();
    }

    public boolean delete(String task){
        int index = indexOf(task);
        if(index == -1){
            return false;
        }else if(index == 0){
            deleteFirst();
            return true;
        }else if(index == size-1){
            deleteLast();
            return true;
        } else {
            int i=0;
            TwoLink currentLink = first;
            while(i<index){
                currentLink = currentLink.getNext();
                i++;
            }
            TwoLink previos = currentLink.getPrev();
            TwoLink next = currentLink.getNext();
            previos.setNext(next);
            next.setPrev(previos);
            size--;
            return true;
        }
    }

    private class Iter implements Iterator<TwoLink> {

        TwoLink current = new TwoLink(first);

        @Override
        public boolean hasNext() {
            return current.getNext() != null;
        }

        @Override
        public TwoLink next() {
            current = current.getNext();
            return current;
        }
    }

    @Override
    public Iterator<TwoLink> iterator() {
        return new Iter();
    }


}
