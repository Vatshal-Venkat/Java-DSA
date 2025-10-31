import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        lol();
    }

    public static void lol() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to chcek palindromity: ");
        int n = sc.nextInt();

        int rev = 0;
        int a=n;
        int pown = String.valueOf(n).length();
        int pow = pown-1;


        while(a>0){
            int last = a%10;
            rev = rev + (last * (int)Math.pow(10, pow));
            a = (int)a/10;
            pow--;
        }

        System.out.println("The reversed number is: "+rev);

        if (n == rev){
            System.out.println(n+" is a Palindromic Number");
        }

        else{
            System.out.println(n+" is not a Palindrome Number");
        }
    }
}
