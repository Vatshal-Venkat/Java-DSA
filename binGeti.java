
import java.util.Scanner;

public class binGeti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number in binary format: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the bit you want to find out: ");
        int i = sc.nextInt();
        System.out.print((n & (1<<i)));
    }
}

//Check again, Take loops.
//Make a function and return 0 and 1.