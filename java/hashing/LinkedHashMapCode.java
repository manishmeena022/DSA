import java.util.LinkedHashMap;

public class LinkedHashMapCode {
    
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",  100);
        lhm.put("China", 150);
        lhm.put("USA", 200);

        System.out.println(lhm);
    }
}
