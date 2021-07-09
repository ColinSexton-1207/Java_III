package val;

public class Cuboid<E extends Number> {
    private E length, breadth, height; // Generic dimensions of the cuboid
    private double volume;

    public Cuboid(E length, E breadth, E height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Set Methods
    public void setLength(E length) { this.length = length; }
    public void setBreadth(E breadth) { this.breadth = breadth; }
    public void setHeight(E height) { this.height = height; }

    // Get Methods
    public E getLength() { return length; }
    public E getBreadth() { return breadth; }
    public E getHeight() { return height; }

    public double getVolume() {
        return height.doubleValue() * breadth.doubleValue() * height.doubleValue();
    }

    // toString() Method
    @Override
    public String toString() {
        return "Length: " + length + "\n" + "Breadth: " + breadth + "\n" + "Height: " + height;
    }
}
