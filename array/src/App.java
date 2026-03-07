public class App {
    public static void main(String[] args) throws Exception {
        
        // array = used to store multiple values within a single variable
        String[] cars = {"Camaro", "Mustang", "Challenger"};
        System.out.println(cars[0]);
        // change an element
        cars[0] = "Corvette";
        System.out.println(cars[0]);

        String[] cars2 = new String[3];
        cars2[0] = "Fiat";
        cars2[1] = "Mini Cooper";
        cars2[2] = "Smart Car";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars2[i]);
        }
    }
}
