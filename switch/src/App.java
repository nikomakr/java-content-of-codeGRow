public class App {
    public static void main(String[] args) throws Exception {
        // switch = statement that allows a variable to be tested for equality against a list of values

        String day = "Tuesday";

        switch (day) {
            case "Monday":
                System.out.println("It's Monday");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday");
                break;
            case "Thursday":
                System.out.println("It's Thursday");
                break;
            case "Friday":
                System.out.println("It's Friday");
                break;
            default:
                System.out.println("It's the weekend");
        }   
    }
}
