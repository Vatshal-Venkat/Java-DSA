public class bino{
    public static int facto(int a){
        int f=1;
        
        for (int i=1;i<=a;i++){
            f= f*i;
        }
        System.out.println("The factorial of "+a+" is: "+f);
        return f;
    }

    public static int binomial(int n,int r){
        int x = facto(n);
        int y = facto(r);
        int z = facto(n-r);

        int bin = x/(y*z);

        System.out.println("Binomial Expansion of ("+n+","+r+") is: "+bin);
        return 0;
    }

public static void main(String args[]){
    
    binomial(6,4);
}
}