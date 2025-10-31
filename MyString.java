import java.util.*;
public class MyString {
    public static void main(String[] args) {
        //String str = "Venkat";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String :");
        String str1 = sc.nextLine();
        //.next() only until space|||.nextLine() whole line.
        //System.out.println(str+' '+str1);
        //String len = str+str1;
        System.out.println("The length of total string is: "+str1.length());

        printLetters(str1);
    }
    public static void printLetters(String str1){
        for (int i=0; i<str1.length();i++){
            System.out.print(str1.charAt(i)+" ");
        }
    }
}
