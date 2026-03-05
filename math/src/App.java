public class App {
    public static void main(String[] args) throws Exception {
        double x = 3.14;
        double y = -10.332;

        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));

        System.out.println(Math.abs(y));
        System.out.println(Math.sqrt(Math.abs(x)));

        System.out.println(Math.round(y));
        System.out.println(Math.ceil(y));
        System.out.println(Math.floor(y));

    }
}
