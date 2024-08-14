import java.util.*;

// the functions of stack are --
//  s.push()
//  s.pop()
//  s.peek()
//  s.isEmpty()
//  s.size()

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(5); 
        s.push(3); 
        s.push(4); 
        s.push(8); 
        // System.out.println(s.peek());
        System.out.println("the size of stack is " + s.size());
        while(s.empty()!=true){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println("the size of stack is " + s.size());


    }
}