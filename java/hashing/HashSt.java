import java.util.HashSet;
import java.util.Iterator;

public class HashSt {
    
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);

        System.out.println(set);

        // Iterators
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        // For Each
        for (Integer s : set) {
            System.out.println(s);
        }

        if(set.contains(4)){ 
            System.out.println("True"); 
        }else {  
            System.out.println("false");
        }

        set.remove(2);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
