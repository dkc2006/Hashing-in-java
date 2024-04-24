package hashMap;

import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("India", 100);
        hashMap.put("France", 200);
        hashMap.put("Germany", 300);
        hashMap.put("United States", 400);
        hashMap.put("Nepal", 500);

        //Iterate
        Set<String> keySet = hashMap.keySet();
        System.out.println(keySet);
        for (String key : keySet) {
            System.out.println("key="+key+" value="+hashMap.get(key));
        }
    }
}
