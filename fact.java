import java.util.*;
public class fact{
    public static int facto(int n){
        int f=1;
        
        for (int i=1;i<=n;i++){
            f= f*i;
        }
        System.out.println("The factorial of "+n+" is: "+f);
        return f;
    }

public static void main(String args[]){
    
    facto(14);
}
}
