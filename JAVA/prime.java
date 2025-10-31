import java.util.*;
class prime{
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int n = v.nextInt();

        boolean prim = true;
        for (int i=2; i<=n-1;i++){
            if (n%i==0){
                prim = false;
            }
        }

        if (prim ==true){
            System.out.println(""+n+" is Prime");
        }

        else{
            System.out.println(n+" is not Prime number");
        }

    }
}