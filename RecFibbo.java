
import java.util.Scanner;

public class RecFibbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of numbers:");
        int n = sc.nextInt();
        System.out.println(Fib(n));
    }
    public static int Fib(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
    return Fib(n-1)+Fib(n-2);
    }
}
