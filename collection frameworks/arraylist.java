import java.util.*;
class arraylist{
// functions of array list are --
// list.add();    // can be used with index also
// list.set(a,b);
// list.get(index)
// li.remove()    // used with index
// li.size()
public static void main(String[] args) {
    ArrayList<Integer> list= new ArrayList<Integer>();
    list.add(3);
    list.add(5);
    list.add(8);
    list.add(11);
    list.add(1,69);
    list.set(1,9);
    System.out.println(list);
    list.remove(1);
    System.out.println(list.get(2));
    System.out.println(list);
    System.out.println(list.size());
    System.out.println(list.get(list.size()-1));
    list.remove(list.size()-1);
    System.out.println(list);
    System.out.println(list.size());
}
}