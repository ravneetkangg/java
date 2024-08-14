class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){               //constructor
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){       //constructor
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){        //constructor
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class constructors {
    public static void main(String[] args) {
        //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
        MyMainEmployee harry = new MyMainEmployee();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());


        MyMainEmployee e1=new MyMainEmployee("ravneet");
        System.out.println(e1.getName());
        System.out.println(e1.getId());
    }
}