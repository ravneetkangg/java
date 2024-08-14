import java.util.*;
// functions of linked list are --
// li.addFirst();
// li.addLast();
// li.add();      same as addlast
// li.remove();   same as removeFirst, can be used with index also
// li.removeFirst();
// li.removeLast();
//
// li.get();
// li.size();

class linkedlist{
    public static void main(String[] args) {
        LinkedList<String> li=new LinkedList<String>();
        li.addFirst("jatt");
        li.addFirst("ravneet");
        li.addLast("chitkara");
        li.add("samsung");    // add also adds to the last
        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.get(1));
        li.removeLast();
        li.removeFirst();
        System.out.println(li);
        li.remove();      // removes the first element , remove can also be used with index
        System.out.println(li);
    }
}