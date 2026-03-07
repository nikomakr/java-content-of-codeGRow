public class App {
    public static void main(String[] args) throws Exception {
        
        // 2D Array = an array of arrays
        
        // String[][] cars = new String[3][3];

        // cars[0][0] = "Camaro";
        // cars[0][1] = "Mustang";
        // cars[0][2] = "Challenger";

        // cars[1][0] = "Corvette";
        // cars[1][1] = "Viper";
        // cars[1][2] = "Spyder";

        // cars[2][0] = "GTR";
        // cars[2][1] = "Supra";
        // cars[2][2] = "Skyline";

        // The above can be written as:
        String[][] cars = {
            {"Camaro", "Mustang", "Challenger"},
            {"Corvette", "Viper", "Spyder"},
            {"GTR", "Supra", "Skyline"}
        };

        // Use of nested for loops to print out the 2D array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(); // Print a new line for better formatting
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
