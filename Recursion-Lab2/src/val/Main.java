package val;

public class Main {

    public static void main(String[] args) throws Exception {
        RecursiveArray arr = new RecursiveArray();

        arr.pushArray(); // Adds element to Array
        System.out.println("Original Array: " + arr.toString()); // Outputs original Array
        arr.reverseArray(arr.getList(), 0, arr.getLength() -1); // Reverses Array
        System.out.println("Reversed Array: " + arr.toString()); // Outputs reversed Array
        System.out.println("Max Value: " + arr.maxArray(arr.getList(), 0, 0));
        //System.out.println("Continue...");
       // arr.pushArray();
        //System.out.println(arr.toString());
    }
}
