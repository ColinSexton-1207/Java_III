package val;

public class Map<E, T> {
    private E key;
    private T value;

    public Map(E key, T value) {
        this.key = key;
        this.value = value;
    }

    // Set Methods
    public void setKey() { this.key = key; }
    public void setValue() { this.value = value; }

    // Get Methods
    public E getKey(E key) { return key; }
    public T getValue(T value) { return value; }

    // toString() Method
    public String toString() {
        return "Key: " + key + " | Value: " + value;
    }
}
