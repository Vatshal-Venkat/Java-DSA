
import java.util.Scanner;

public class bitOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number in binary format: ");
        int n = sc.nextInt();
        int bitMask = 1;
        if ((n & bitMask) == 1){
            System.out.println(n+" is an odd number");
        }else{
            System.out.println(n+" is an even number");
        }
    }
}
