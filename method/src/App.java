import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        
        //method = a block of code that is executed whenever it is called upon

    //     String name = "codeGRow";
    //     int age = 22;
    //     hello(name, age);
    // }
    //     static void hello(String name, int age){
    //         System.out.println("Hello " + name + ", you are " + age + " years old.");
    //     }

        int x = 3;
        int y = 5;

        // int z = add(x,y);
        // System.out.println(z);
        System.out.println(add(x,y));
    }
    static int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }    

}
