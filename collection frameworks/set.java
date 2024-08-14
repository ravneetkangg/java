import java.util.*;
public class set{
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        if(set.contains(1)==true){
            System.out.println("yes it contains");
        }
        if(set.contains(6)!=true){
            System.out.println("does not contains");
        }

        set.remove(1);
        if(set.contains(1)!=true){
            System.out.println("no it do not contains");
        }


        System.out.println(set.size());
        System.out.println(set);



        // iterator
        
        Iterator<Integer> it =set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}