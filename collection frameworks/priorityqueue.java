import java.util.*;
public class priorityqueue {
    public static void main(String args[]){
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        pq.add(40);
        pq.add(12);
        pq.add(24);
        pq.add(36);
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
