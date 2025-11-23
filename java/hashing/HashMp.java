import java.util.*;
public class HashMp {
    
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert --O(1)
        hm.put("India", 12000);
        hm.put("USA", 15000);
        hm.put("China", 12345);


        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String key : keys) {
            System.out.print("Key = "+ key + " -- " + "Value  : " + hm.get(key));
        }



        // System.out.println(hm);

        // //Get --O(1)
        // System.out.println(hm.get("India"));

        // System.out.println(hm.get("Russia"));


        // //ContainsKey --O(1)
        // System.out.println(hm.containsKey("India" ));

        // // Remove  -- O(1)
        // System.out.println(hm.remove("China"));

        // //Size  -- O(1)
        // System.out.println(hm.size());

        // //Is Empty
        // System.out.println(hm.isEmpty());

        // //Clear
        // hm.clear();
    }
}
