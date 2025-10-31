import java.util.*;
public class StrPalind {
    public static boolean check(String str){
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            //System.out.print(str.charAt(i));
           
            if (str.charAt(i) != str.charAt(n-1-i)){
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        System.out.println(check(str)); 
    }
}
