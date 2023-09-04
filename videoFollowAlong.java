import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class videoFollowAlong {
    public static void main(String[] args) {


        String phrase = "Giraffe Academy";

        System.out.println(phrase.substring(0, phrase.indexOf(" ")));
        System.out.println("\n\n");

        String[] cars = {"BMW M2", "Veloster N", "GTI"};

        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("\n\n");

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(7);
        numbers.add(2);

        for (int a : numbers) {
            System.out.println(a);
        }

        System.out.println("\n\n\n");



        String [] friends = {"Jim", "Angela", "Oscar", "Dwight"};

        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);


        }












    }
}