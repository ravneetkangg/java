abstract class Animal{
    abstract void walks();
    // but you can make non abstract function in abstract also
    // IF YOU WANT TO MAKE AN ABSTRACT CLASS WITHOUT ANY NON ABSTRACT FUNCTION 
    // YOU CAN MAKE AN INTERFACE
}
// animal class is irrevelent in the given code so we have to hide it
// we will never make the animal object

class Horse extends Animal{
    public void walks(){
    System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walks(){
    System.out.println("walks on 2 legs");
    }
}


public class abstraction {
    public static void main(String args[]){
        Horse h1=new Horse();
        h1.walks();
        // you cant make the animal object because it is abstracted
    }
}
