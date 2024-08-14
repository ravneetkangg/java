import java.util.*;

// the functions of queue are --
//  q.add()
//  q.remove()
//  q.peek()
//  q.isEmpty()
//  q.size()

public class queue {
    public static void main(String[] args) {
        Queue <Integer> q=new LinkedList<Integer>();  // note that queue can be implemented using linked list only
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("the size of queue is " + q.size());
       while(q.isEmpty()!=true){
        System.out.println(q.peek());
        q.remove();
       }
       System.out.println("the size of queue is " + q.size());

    }
}