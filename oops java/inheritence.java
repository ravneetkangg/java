// other class taked properties of a class

class Shape{
          String color;
    }

class Triangle extends Shape{    // extend keyword makes Shape as base class of triangle

    }

public class inheritence {
    public static void main(String args[]){
        Triangle t1=new Triangle();
        t1.color="red";
        System.out.println(t1.color);
    }
}
