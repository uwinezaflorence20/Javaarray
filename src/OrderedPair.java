public class OrderedPair<K extends Comparable<K>, V> {
    public K key;
    public V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public boolean isKeyGreaterThan(OrderedPair<K,?> otherpair){
        return this.key.compareTo(otherpair.getKey()) > 0;
    }

    public static void main(String[] args) {
        OrderedPair<String, Integer> p1 = new OrderedPair<>("apple", 1);
        OrderedPair<String, Integer> p2 = new OrderedPair<>("banana", 2);

        System.out.println("Is p1's key greater than p2's key?" +p1.isKeyGreaterThan(p2));

        OrderedPair<Integer, String> p3 = new OrderedPair<>(10, "Ten");
        OrderedPair<Integer, String> p4 = new OrderedPair<>(5, "Five");

        System.out.println("Is p3's key greater than p4's key?" +p3.isKeyGreaterThan(p4));
    }
}
