package val;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map1 = new Map<>("1989", "GT-R");
        Map<String, String> map2 = new Map<>("1969", "Capri");
        Map<String, String> map3 = new Map<>("1953", "Corvette C1");

        System.out.println(map1.toString() + "\n" + map2.toString() + "\n" + map3.toString());

    	// Version 2.0 Code
	    //Cuboid<Double> c1 = new Cuboid<>(1.5, 2.5, 3.5);
	    //System.out.println(c1.toString() + "\n" + "Volume: " + c1.getVolume());

	    // Version 1.0 Code
	    //Cuboid<String> c2 = new Cuboid<>("Test", "Best", "Nest");
	    //System.out.println("C1: " + c1.toString() + "\n" + "C2: " + c2.toString());
    }
}
