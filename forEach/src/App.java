import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        //for-each loop
        //ligotera vhmate
        //ligotera flexible

        // String[] cars = {"BMW","Mercedes","VW"};

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Ford");
        cars.add("VW");


        for (String i : cars) {
            System.out.println(i);
        }
    }
}
