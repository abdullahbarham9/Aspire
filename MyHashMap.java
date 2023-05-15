

import java.util.HashMap;

public class MyHashMap<K, V> {
    private HashMap<K,V> map;

    public MyHashMap() {
        map = new HashMap<>();
    }

    public void put(K key, V value) {
        map.put(key, value);
    }
    public V get(K key) {
        return map.get(key);
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> myMap = new MyHashMap<>();
        myMap.put(1,"one");
        myMap.put(2,"two");
        myMap.put(3,"three");
        myMap.put(4,"four");


        System.out.println(myMap.get(3));
        System.out.println(myMap.get(1));

    }
}
