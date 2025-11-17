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

    public void display() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class PairExample {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Age", 25);
        Pair<String, String> p2 = new Pair<>("Country", "Japan");

        p1.display();
        p2.display();
    }
}
