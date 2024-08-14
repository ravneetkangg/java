import java.util.Scanner;     // necessary for taking inputs
public class input {
    public static void main(String[] args){
        Scanner obj1=new Scanner(System.in);   // scan is name of the object
        System.out.println("enter name");

        String input =obj1.nextLine();   // Strnig is datatype, input is variable, nextLIne is used to take string inputs, scan is its object
        int number;
        number =obj1.nextInt();      // Int is datatype, number is variable, nexxtInt is used for taking int inputs

        System.out.println(input);
        System.out.println(number);

    }
    
}
