import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // nested loop = a loop inside a loop
        Scanner scanner = new Scanner(System.in);

        int rows, columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter a symbol to use: ");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
           System.out.println();
        }
    }
}
