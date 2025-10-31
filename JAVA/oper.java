import java.util.*;
public class oper {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("SUM-"+(A+B));
        System.out.println("DIFFERENCE-"+(A-B));
        System.out.println("PRODUCT-"+(A*B));
        System.out.println("DIVISION-"+(A/B));
        System.out.println("REMAINDER-"+(A%B));

//UNARY OPERATOR
        A=A++;    //POST INCR.
        B=--B;    //PRE incr

        System.out.println("NEW SUM-"+(A+B));
    }
}

/*Relational Operators
 * ==
 * !=
 * >=
 * <=
 * >
 * <
 */