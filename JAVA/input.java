import java.util.*;
public class input {
    public static void main(String args[]){
        Scanner vv = new Scanner(System.in);
        String input = vv.next();
        System.out.println("Input Text is:"+input);
        
        //nextLine() for input with spaces.
        Scanner nm = new Scanner(System.in);
        String name = nm.nextLine();
        System.out.println("Full Input Text is: "+name);

        //for integer inputs
        Scanner sd = new Scanner(System.in);
        int alpha = sd.nextInt();
        System.out.println("Number input is: "+alpha);

        //for float: nextFloat()
    }
}
