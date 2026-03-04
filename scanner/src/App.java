import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = scanner.nextLine();

        System.out.println("What's your age? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What's your favourite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favourite food is " + food);
    }
}
