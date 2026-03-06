import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // logical operators = used to connect two or more expressions
        //
        //      && = (AND) both conditions must be true
        //      || = (OR) at least one condition must be true
        //      ! = (NOT) negates the result of a condition

        // int temp = 25;

        // if (temp > 30) {
        //     System.out.println("It's a hot day");
        // }
        // else if (temp >= 20 && temp <= 30) {
        //     System.out.println("It's a nice day");
        // }
        // else if (temp < 20 || temp == 20) {
        //     System.out.println("It's a cold day");
        // }


        Scanner scanner = new Scanner(System.in);


        // System.out.print("You are playing a game! Press W to move up, S to move down, A to move left, D to move right: ");
        // String response = scanner.next();

        // if (response.equals("W") || response.equals("w")) {
        //     System.out.println("You moved up");
        // }
        // else if (response.equals("S") || response.equals("s")) {
        //     System.out.println("You moved down");
        // }
        // else if (response.equals("A") || response.equals("a")) {
        //     System.out.println("You moved left");
        // }
        // else if (response.equals("D") || response.equals("d")) {
        //     System.out.println("You moved right");
        // }
        // else {
        //     System.out.println("Invalid input");
        // }
        

        System.out.print("You are playing a game! press q or Q to quit:  ");
        String response = scanner.next();

        if (!response.equals("Q") && !response.equals("q")) {
            System.out.println("You are still playing the game");
        }
        else {
            System.out.println("You quit the game");
        }
    }
}
