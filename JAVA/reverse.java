import java.util.*; 
public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        
        while (num>0){
            rev = num%10;
            System.out.print(rev);
            num = num/10;
        }
    }
}

//or for loop and rev = (rev*10)+rem !!!