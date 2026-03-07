import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<ArrayList<String>> partyList = new ArrayList<ArrayList<String>>();

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("tsipouro");
        drinkList.add("ouzo");
        drinkList.add("Gin");

        ArrayList<String> sodaList = new ArrayList<>();
        sodaList.add("tonic");
        sodaList.add("cola");
        sodaList.add("soda");

        ArrayList<String> foodList = new ArrayList<>();
        foodList.add("pitogyro");
        foodList.add("pizza");

        partyList.add(drinkList);
        partyList.add(sodaList);
        partyList.add(foodList);

        System.out.println(partyList.get(0).get(1)); // first get the first list and then get the second element of that list
    }
}
