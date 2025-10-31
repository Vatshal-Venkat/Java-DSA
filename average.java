import java.util.*;
public class average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        int c = sc.nextInt();
        double avg = (a+b+c)/3;

        System.out.println("The Average of given 3 numbers is: "+avg);
    }
}
