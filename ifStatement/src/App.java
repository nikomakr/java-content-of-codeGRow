public class App {
    public static void main(String[] args) throws Exception {
        
        // if statement = execute some code if a condition is true

        int age = 80;
        // double == as the single = assigns a value below
        if (age == 80) {
            System.out.println("OK boomer");
        }
        else if (age >= 18) {
            System.out.println("You an adult");
        }
        else if (age >= 13) {
            System.out.println("You a teenager");
        }
        else {
            System.out.println("You a child");
        }
    }
}
