package hmJava3.GrokaemAlgoritms.dz.homework4.TwoLinkedList;

public class TwoLink {

    private String task;
    private TwoLink next;
    private TwoLink prev;

    public TwoLink(String task){
        this.task = task;
    }

    public TwoLink(TwoLink next){
        this.next = next;
    }

    public TwoLink getNext() {
        return next;
    }

    public void setNext(TwoLink next) {
        this.next = next;
    }

    public TwoLink getPrev() {
        return prev;
    }

    public void setPrev(TwoLink prev){
        this.prev = prev;
    }

    public String getTask() {
        return task;
    }
}
