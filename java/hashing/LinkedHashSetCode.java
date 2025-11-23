import java.util.LinkedHashSet;

public class LinkedHashSetCode {
    
    public static void main(String[] args) {
        LinkedHashSet<Integer> LHS = new LinkedHashSet<>();

        LHS.add(1);
        LHS.add(2);
        LHS.add(3);
        LHS.add(4);
        LHS.add(4);
        LHS.add(3);
        LHS.add(2);
        LHS.add(1);

        LHS.remove(4);
    }
}
