package val;

public class Main {

    public static void main(String[] args) {
        Sort<Integer> s = new Sort<Integer>();
        Integer[] list = {3, 10, 349, -198, 239, 49};
        s.bubbleSort(list);
        for (Integer integer : list) System.out.print(integer + " "); // Print out the sorted list
    }
}
