class Shape {                      // base class
    public void area() {
    System.out.println("displays area");
    }
}


class Triangle extends Shape{          // single leve inheritence from shape class
    public void area(int l, int h) {
    System.out.println(1/2*l*h) ;
    }
}


class Circle extends Shape {        // now because shape has more than 1 derived class . it is heirichical inheritence
    public void area(int r){
    System.out.println((3.14)*r*r);
    }
}


class EquilateralTriangle extends Triangle{          // multi level inheritence from Triangle class which itself is derived from shape class
    public void area(){
    System.out.println("area of  EQ triangle");
    }
}


public class singlelevelinheritence {
    public static void main(String args[]){
        System.out.println("gius");
        EquilateralTriangle et1=new EquilateralTriangle();
        et1.area();

    }
}
