class Car{                       // name of class is starts with capital letter,  function with small letter
    String name;
    String colour;

    void printinfo(){
        System.out.println(this.name);      // this keyword is used to make the calling function
        System.out.println(this.colour);
    }

    void printtext(){
        System.out.println("this is text");
    }
}


public class oops {
    public static void main(String args[]){
        Car car1=new Car();                  // making of object
        car1.colour="red";;
        car1.name="ferrri";
        car1.printinfo();
        car1.printtext();
    }
}
