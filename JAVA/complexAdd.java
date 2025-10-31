import java.util.Scanner;
public class complexAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real numbers r1 & r2");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Enter complex numbers c1 & c2");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        Cadd a = new Cadd();
        a.add(r1,r2,c1,c2);
    }
    
    

    
    public static class Cadd{

        Cadd(){
            System.out.println("Complex Addition is called");
        }
        public void add(int r1,int r2,int c1,int c2){
            int result = r1+r2;
            int c = c1+c2;
            System.out.println("The result is:"+result+" + "+c+"i");
        }
    }
}
