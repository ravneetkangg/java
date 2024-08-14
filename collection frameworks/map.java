import java.util.*;
// put
// get 
// containskey
//
public class map {
    public static void main(String[] args) {

        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(1,34);
        map.put(2,45); 
        map.put(3,56);
        System.out.println(map.get(4));
        System.out.println(map.get(4));

        if(map.containsKey(4)){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
        
        System.out.println();

        for(Map.Entry<Integer,Integer> e :map.entrySet()){
            System.out.print (e.getKey() + " ");
            System.out.println(e.getValue());
        }
        
    }    
}