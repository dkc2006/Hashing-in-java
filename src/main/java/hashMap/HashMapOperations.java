package hashMap;

import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        //insert
        hashMap.put("India", 100);
        hashMap.put("France", 200);
        hashMap.put("Germany", 300);
        System.out.println(hashMap);

        //Get - O(1)
        int population = hashMap.get("India");
        System.out.println(population);
        System.out.println(hashMap.get("France"));
        System.out.println(hashMap.get("Indonesia"));

        //ContainsKey - O(1)
        System.out.println(hashMap.containsKey("India"));//true
        System.out.println(hashMap.containsValue("Indonesia"));//false

        //Remove - O(1)

        System.out.println(hashMap.remove("India"));
        System.out.println(hashMap);

        //Size
        System.out.println(hashMap.size());

        //Is Empty
        System.out.println(hashMap.isEmpty());

        //Clear
        hashMap.clear();
        System.out.println(hashMap.isEmpty());
    }
}
