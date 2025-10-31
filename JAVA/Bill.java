import java.util.*;
public class Bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pencil Price");
        float pencil = sc.nextFloat();
        System.out.println("Pen Price");
        float pen = sc.nextFloat();
        System.out.println("Eraser Price");
        int eraser = (int)sc.nextFloat();

        float res = (pencil + pen + eraser);
        System.out.println("Bill without 18% Tax is: "+res);
        double billed = (0.18*res);
        System.out.println(billed);
        double bill = billed +res;
        System.out.println("The Entire bill including 18% Tax is: "+bill);
    }
}
