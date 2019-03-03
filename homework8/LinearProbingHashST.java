package hmJava3.GrokaemAlgoritms.dz.homework8;

public class LinearProbingHashST<Key, Value> {

    private int capacity;
    private int size = 0;
    private Key DELETED;

    private Key[] keys;
    private Value[] values;

    public LinearProbingHashST(int capacity, Key DELETED){

        int provenCapacity;

        if(!isPrimeNumber(capacity)){
            provenCapacity = getPrimeNumber(capacity);
        }else {
            provenCapacity = capacity;
        }

        this.capacity = provenCapacity;
        this.DELETED = DELETED;
        keys = (Key[]) new Object[provenCapacity];
        values = (Value[]) new Object[provenCapacity];
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

    public int hashFuncDouble( Key key ){
        return 5 - (key.hashCode() & 0x7fffffff) % 5;
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
        int step = hashFuncDouble(key);
        while ((keys[i] != null) && (!keys[i].equals(DELETED))) {
            if (keys[i].equals(key)) {
                values[i] = value;
                return;
            }
            i = (i + step) % capacity;
        }
        keys[i] = key;
        values[i] = value;
        size++;
    }

    public Value get(Key key) {
        isKeyNotNull(key);
        int i = hash(key);
        int step = hashFuncDouble(key);
        while (keys[i] != null) {
            if (keys[i].equals(key)) {
                return values[i];
            }
            i = (i + step) % capacity;
        }
        return null;
    }

    public void delete(Key key) {
        isKeyNotNull(key);
        int i = hash(key);
        int step = hashFuncDouble(key);
        while (keys[i] != null) {
            if (keys[i].equals(key)) {
                keys[i] = DELETED;
                size--;
                return;
            }
            i = (i + step) % capacity;
        }
    }

}
