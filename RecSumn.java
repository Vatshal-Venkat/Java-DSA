
import java.util.Scanner;

public class RecSumn {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of numbers:");
        int n = sc.nextInt();
        System.out.println(Sumn(n));

    }
    public static int Sumn(int n){
        if (n==1){
            return 1;
        }
    return n + Sumn(n-1);
    }
}
