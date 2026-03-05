import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double x, y, z;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first leg: ");
        x = scanner.nextDouble();
        System.out.print("Enter the length of the second leg: ");
        y = scanner.nextDouble();

        z = Math.sqrt(((x*x)+(y*y)));
        System.out.println("The length of the hypotenuse is: " + z);

        scanner.close();
    }
}
