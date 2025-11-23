import java.util.HashSet;
import java.util.Iterator;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> hs = new HashSet<>();

        // Union arr1 & arr2
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }

        for(int j=0;j<arr2.length;j++){
            hs.add(arr2[j]);
        }

        System.out.println("Union size" + " : " + hs);

        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        // Intersection
        hs.clear();
        
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }

        int count = 0;
        for(int j=0;j<arr2.length;j++){
            if(hs.contains(arr2[j])){
                count++;
               System.out.println(hs.remove(arr2[j]));
            }
        }

        System.out.println("Intersection : " +  count);
    
    }
}
