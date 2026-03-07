public class App {
    public static void main(String[] args) throws Exception {
        
        // wrapper class: Integer, Double, Float, Long, Short, Byte, Character, Boolean
        // It is used to convert primitive data types into objects and vice versa.
        // References data types useful for collections, generics, and other object-oriented programming features.
        // Can be used to perform operations on primitive data types using methods provided by the wrapper classes.
        
        // primitives   // wrapper
        //-----------   //--------
        // boolean       // Boolean
        // char          // Character
        // int           // Integer
        // double        // Double
        // float         // Float
        // long          // Long
        // short         // Short
        // byte          // Byte
        // void          // Void
        
        // String is not a wrapper class, it is a class that represents a sequence of characters.
        // String is a reference data type, it is not a primitive data type.

        // autoboxing primitive -> wrapper
        // unboxing wrapper -> primitive

        // autoboxing is the automatic conversion of primitive data types to their corresponding wrapper classes.
        // unboxing is the automatic conversion of wrapper classes back to their corresponding primitive data types.

        Boolean isTrue = true;
        Character xxx = '#';
        Integer num = 5;
        Double d = 2.332;

        if (isTrue) {
            System.out.println("isTrue: " + isTrue);
            System.out.println("xxx: " + xxx);
            System.out.println("num: " + num);
            System.out.println("d: " + d);
        }
    }
}
