import java.util.*;
public class Sumofint {
    public static void main(String args[]){
        ino();
    }

    public static void ino(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n=a;
        int sum = 0;
        
        while (n>0){
            int last = n%10;
            sum = sum + last; 
            n = (int)n/10;
        }
        System.out.println("Sum of integers of "+a+" is: "+sum);
    }
}
