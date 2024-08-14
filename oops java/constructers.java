class Student{                       
    String name;
    int rollno;

    void printinfo(){
        System.out.println(this.name);      
        System.out.println(this.rollno);
    }

    Student(String name, int rollno){                            //  this is a constructer ( parameterised )
        this.name=name;
        this.rollno=rollno;

    }

    Student(Student s2){                                         // copy constructor
        this.name=s2.name;
        this.rollno=s2.rollno;
    }
}




public class constructers {
    public static void main(String args[]){

        // Student s1=new Student();                  
        // s1.name="Ravneet";
        // s1.rollno=2155;
        // s1.printinfo();
        Student s1 = new Student("ravneet",2155);
        s1.printinfo();

        Student s2 = new Student("anjolina",2156);
        s2.printinfo();

        Student s3=new Student(s1);
        s3.printinfo();

    }
}
