package samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSample {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();

        // Adding names
        nameList.add("Izzie Ho");
        nameList.add("Dougy Lee");
        nameList.add("Peter Rabbit");
        nameList.add("Johnny Depp");
        nameList.add("Jono Ho");

        // Retrieving a name from a list
        String firstStudent = nameList.get(0);

        // Printing a list
        System.out.println(nameList);

        // Sorting a list alphabetically
        Collections.sort(nameList);

        // Print it to prove it's sorted
        System.out.println(nameList);

        // Shuffle the list
        Collections.shuffle(nameList);
    }

}
