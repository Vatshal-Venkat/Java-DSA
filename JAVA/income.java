import java.util.*;
public class income {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int incom = sc.nextInt();
        int tax;

        if (incom < 500000){
            tax = (int) (incom * 0.1);

            
        }
        else if (incom >= 500000 && incom < 1000000){
            tax = (int) (incom *0.2);
        }

        else{
            tax = (int) (incom * 0.3);
        }

        System.out.println("Tax Deduction: "+tax);
        System.out.println("In Hand: "+(incom-tax));
    }
}
