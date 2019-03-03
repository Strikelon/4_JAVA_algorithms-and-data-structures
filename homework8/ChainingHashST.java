package hmJava3.GrokaemAlgoritms.dz.homework8;

import java.util.LinkedList;

public class ChainingHashST<Key, Value> {

    private int capacity;
    private int size = 0;

    private LinkedList<Node>[] st;

    class Node {
        private Key key;
        private Value value;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    public ChainingHashST(int capacity) {

        int provenCapacity;

        if(!isPrimeNumber(capacity)){

            provenCapacity = getPrimeNumber(capacity);

        }else {

            provenCapacity = capacity;

        }
        this.capacity = provenCapacity;
        st = new LinkedList[provenCapacity];
        for (int i = 0; i < provenCapacity; i++) {
            st[i] = new LinkedList<>();
        }

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }


    private boolean isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Ключ не должен быть null");
        }
        return true;
    }

    public void put(Key key, Value value) {
        isKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                node.value = value;
                return;
            }
        }
        st[i].addLast(new Node(key, value));
        size++;
    }

    public boolean delete(Key key){
        isKeyNotNull(key);
        int i = hash(key);
        Node deleteNode = null;
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                deleteNode = node;
                break;
            }
        }

        if(deleteNode != null){

            st[i].remove(deleteNode);
            size--;
            return true;

        }else {

            return false;

        }

    }

    public Value get(Key key) {
        isKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if (key.equals(node.key)) {
                return node.value;
            }
        }
        return null;
    }

    private boolean isPrimeNumber(int number){
        for ( int i = 2 ; ( i * i <= number ); i ++)
            if ( number % i == 0)
                return false;
        return true;
    }


    private int getPrimeNumber(int capacity){
        for ( int i = capacity + 1 ; true ; i ++){
            if (isPrimeNumber(i))
                return i;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < capacity; i++) {
            for (Node node : st[i]) {
                s += node.key.toString() + " ";
            }
            s += "\n";
        }

        return "ChainingHashST{\n" +
                "capacity=" + capacity + "\n" +
                "size=" + size + "\n" +
                s +
                '}';
    }

}
