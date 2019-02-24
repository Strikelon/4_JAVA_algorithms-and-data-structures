package hmJava3.GrokaemAlgoritms.dz.homework4.SingleLinkedList;

public class SingleLink {

    private String task;
    private SingleLink next;

    public SingleLink(String task){
        this.task = task;
    }

    public SingleLink(SingleLink next){
        this.next = next;
    }

    public SingleLink getNext() {
        return next;
    }

    public void setNext(SingleLink next) {
        this.next = next;
    }

    public String getTask() {
        return task;
    }
}
