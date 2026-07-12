import java.util.Scanner;
public class TCS3 {

    public static boolean by3(int num){
        int ans = num;
        int res = 0;
        while (ans>0){
            int as = ans%10;
            res = res + as;
            ans = ans/10;
        }
        if ((res%3) == 0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(by3(num));
    }
}