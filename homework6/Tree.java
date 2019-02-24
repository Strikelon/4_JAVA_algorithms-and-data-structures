package hmJava3.GrokaemAlgoritms.dz.homework6;

import java.util.NoSuchElementException;

public class Tree{

    private Node root;

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getSize();
    }

    public int size() {
        return size(root);
    }

    public boolean isEmpty() {
        return root == null;
    }

    private boolean isIdNotNull(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("Не может id равняться null");
        }
        return true;
    }

    private Integer get(Node node, Integer id) {
        isIdNotNull(id);
        if (node == null) {
            return null;
        }
        int cmp = id.compareTo(node.getId());
        if (cmp == 0) {
            return node.getValue();
        } else if (cmp < 0) {
            return get(node.getLeft(), id);
        } else {
            return get(node.getRight(), id);
        }
    }

    public Integer get(Integer id) {
        return get(root, id);
    }

    public boolean contains(Integer id) {
        isIdNotNull(id);
        return get(id) != null;
    }

    private Node put(Node node, Integer id, Integer value){

        if (node == null) {
            return new Node(id, value);
        }
        int cmp = id.compareTo(node.getId());
        if (cmp == 0) {
            node.setValue(value);
        } else if (cmp < 0) {
            node.setLeft(put(node.getLeft(), id, value));
        } else {
            node.setRight(put(node.getRight(), id, value));
        }
        node.setSize(size(node.getLeft()) + size(node.getRight()) + 1);
        return node;

    }

    public void put(Integer id, Integer value){
        isIdNotNull(id);
        if (value == null) {
            return;
        }
        root = put(root, id, value);
    }

    private Node min(Node node) {
        if (node.getLeft() == null) {
            return node;
        }
        return min(node.getLeft());
    }

    public Integer min() {
        return min(root).getValue();
    }

    private Node max(Node node) {
        if (node.getRight() == null) {
            return node;
        }
        return max(node.getRight());
    }

    public Integer max() {
        return max(root).getValue();
    }

    private Node deleteMin(Node node) {
        if (node.getLeft() == null) {
            return node.getRight();
        }
        node.setLeft(deleteMin(node.getLeft()));
        node.setSize(size(node.getLeft()) + size(node.getRight()) + 1);
        return node;
    }

    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        root = deleteMin(root);
    }


    private Node delete(Node node, Integer id) {
        if (node == null) {
            return null;
        }
        int cmp = id.compareTo(node.getId());
        if (cmp < 0) {
            node.setLeft(delete(node.getLeft(), id));
        } else if (cmp > 0) {
            node.setRight(delete(node.getRight(), id));
        } else {
            if(node.getLeft() == null ){
                return node.getRight();
            }
            if(node.getRight() == null ){
                return node.getLeft();
            }
            Node temp = node;
            node = min(node.getRight());
            node.setRight(deleteMin(temp.getRight()));
            node.setLeft(temp.getLeft());
        }
        node.setSize(size(node.getLeft()) + size(node.getRight()) + 1);
        return node;
    }

    public void delete(Integer id) {
        isIdNotNull(id);
        root = delete(root, id);
    }


    private String toString(Node node) {
        if (node == null) {
            return "";
        }
        return toString(node.getLeft()) + " " + node.getValue().toString()
                + " " + toString(node.getRight());
    }

    @Override
    public String toString() {
        return "Tree{" +
                toString(root) +
                '}';
    }

    public int getTreeHeight(){
        return height(root);
    }

    public boolean isBalanced(){

        if(root.getLeft() == null || root.getRight() == null){
            return false;
        }else {

            int leftHeight, rightHeight;
            leftHeight = height(root.getLeft());
            rightHeight = height(root.getRight());

            System.out.println("LeftHeight: " + leftHeight);
            System.out.println("RightHeight: " + rightHeight);

            if(Math.abs(leftHeight - rightHeight) <=1){
                return true;
            }else {
                return false;
            }

        }

    }

    private int height(Node node){
        int left, right;
        if(node != null){
            left = height(node.getLeft());
            right = height(node.getRight());
            if(left > right){
                return left+1;
            }else {
                return right+1;
            }
        }else {

            return 0;

        }
    }

}
