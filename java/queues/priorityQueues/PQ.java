import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ{

    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Reverse Order PQ
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4)); // O(logN)
        pq.add(new Student("B", 6));
        pq.add(new Student("C", 3));
        pq.add(new Student("D", 1));
        pq.add(new Student("E", 2));
        pq.add(new Student("F", 5));

    

        while(!pq.isEmpty()){
            System.out.print(pq.peek().name + " -> " + pq.peek().rank + " "); // O(1)
            pq.remove(); // O(logN)
        }
    }
}