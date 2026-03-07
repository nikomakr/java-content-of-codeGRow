public class App {
    public static void main(String[] args) throws Exception {
        
        // String = data type can store characters and text

        String name = " Bro Code";

        boolean result = name.equals("bro code");
        System.out.println(result);
        boolean result2 = name.equalsIgnoreCase("bro code");
        System.out.println(result2);

        int value = name.length();
        System.out.println(value);

        char result3 = name.charAt(0);
        System.out.println(result3);

        int index = name.indexOf("o");
        System.out.println(index);

        boolean result4 = name.isEmpty();
        System.out.println(result4);

        String result5 = name.toUpperCase();
        System.out.println(result5);

        String result6 = name.toLowerCase();
        System.out.println(result6);

        String result7 = name.trim();
        System.out.println(result7);

        String result8 = name.replace("o", "A");
        System.out.println(result8);
    }
}