import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        // int x = random.nextInt(6)+1;

        // double x = random.nextDouble(2)+1;

        boolean x = random.nextBoolean();

        System.out.println(x);
    }
}
