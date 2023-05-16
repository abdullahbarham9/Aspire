import java.util.LinkedList;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}


class MyHashMap<K, V> {
    private LinkedList<Pair<K, V>>[] pairs;
    private int capacity;

    public MyHashMap() {
        capacity = 16;
        pairs = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            pairs[i] = new LinkedList<>();
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void put(K key, V value) {
        int pairIndex = hash(key);
        LinkedList<Pair<K, V>> pairsList = pairs[pairIndex];

        for (Pair<K, V> pair : pairsList) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value);
                return;
            }
        }
        pairsList.add(new Pair<>(key, value));
    }

    public V get(K key) {
        int pairIndex = hash(key);
        LinkedList<Pair<K, V>> pairsList = pairs[pairIndex];

        for (Pair<K, V> pair : pairsList) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }


    public static void main(String[] args) {
        MyHashMap<Integer,String> map = new MyHashMap();
        map.put(3,"three");
        map.put(1,"one");
        map.put(2,"two");

        System.out.println(map.get(3));
        System.out.println(map.get(1));
        System.out.println(map.get(2));
    }
}
