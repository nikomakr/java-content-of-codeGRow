import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        // While loop = executes a block of code as long as a specified condition is true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Hello enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Welcome " + name);
    }
}
