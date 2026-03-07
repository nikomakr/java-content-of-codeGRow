import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        // ArrayList = a resizable array. Elements can be added and removed after compilation phase
        //              stores reference data types (objects)

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5); // autoboxing converts int to Integer
        numbers.add(67);
        numbers.add(100);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)); // unboxing converts Integer to int
        }
    }
}
