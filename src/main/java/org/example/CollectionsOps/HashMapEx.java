package org.example.CollectionsOps;

import org.example.dtos.Department;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, Department> map = new ConcurrentHashMap<>();

        // Generate 10 sample Department objects and add them to the map
        map.put(1, new Department(1, "Human Resources", "HR"));
        map.put(2, new Department(2, "Information Technology", "IT"));
        map.put(3, new Department(3, "Finance", "FIN"));
        map.put(4, new Department(4, "Marketing", "MKT"));
        map.put(5, new Department(5, "Sales", "SLS"));
        map.put(6, new Department(6, "Research and Development", "R&D"));
        map.put(7, new Department(7, "Operations", "OPS"));
        map.put(8, new Department(8, "Customer Service", "CS"));
        map.put(9, new Department(9, "Legal", "LGL"));
        map.put(10, new Department(10, "Administration", "ADM"));

        // Optionally, print the map to verify the data
        for (Map.Entry<Integer, Department> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            map.put(11,new Department(11,"IT0","Sahitya"));
            //Since map is Concurrent Hashmap we don't get any issues or ConcurrentMoodificationException

        }



    }
}
