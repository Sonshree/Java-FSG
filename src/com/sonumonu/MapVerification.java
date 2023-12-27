package com.sonumonu;

import java.util.HashMap;
import java.util.Map;

public class MapVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 22);

        // Verifying key existence
        System.out.println("Contains key 'Bob': " + map.containsKey("Bob"));

        // Verifying value existence
        System.out.println("Contains value 22: " + map.containsValue(22));

        // Getting and printing all key-value pairs
        System.out.println("All key-value pairs:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing a key-value pair
        map.remove("Alice");

        // Printing the updated map
        System.out.println("Map after removing 'Alice': " + map);
    }
}

	


