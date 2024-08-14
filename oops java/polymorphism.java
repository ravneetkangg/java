// function with same name is used again and again
// also called overloading
class Student{
    String name;
    int age;
    public void printInfo(String name) {
    System.out.println (name);
    }
    public void printInfo(int age) {
    System.out.println (age);
    }
    public void printInfo(String name, int age) {
    System.out.println (name + " " + age) ;
    }
}


public class polymorphism {
    public static void main(String arga[]){
        Student s1=new Student();
        s1.age =18;
        s1.name="ravneet";
        s1.printInfo("raet");
    }
}
