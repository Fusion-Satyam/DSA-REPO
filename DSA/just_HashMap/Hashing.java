package just_HashMap;



import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Inserting key-value pairs
        map.put("apple", 2);
        map.put("banana", 5);
        map.put("orange", 3);

        // Accessing values
        System.out.println("Apple count: " + map.get("apple"));

        // Checking key
        if (map.containsKey("banana")) {
            System.out.println("Banana is available");
        }

        // Removing key
        map.remove("orange");

        // Traversing map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
