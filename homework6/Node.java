package hmJava3.GrokaemAlgoritms.dz.homework6;

public class Node {

    private Integer id;
    private Integer value;
    private int size;
    private Node left;
    private Node right;

    public Node(Integer id, Integer value){
        this.id = id;
        this.value = value;
        size = 1;
    }

    public Integer getId() {
        return id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
