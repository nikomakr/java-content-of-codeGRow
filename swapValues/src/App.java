public class App {
    public static void main(String[] args) throws Exception {
        String x = "water";
        String y = "gin";

        String temp;
        temp = x;
        x = y;

        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
