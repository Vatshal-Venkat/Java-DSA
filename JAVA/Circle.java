import java.util.Scanner;

public class Circle {
    public static void main(String args[]){
        Scanner io = new Scanner(System.in);
        float rad = io.nextFloat();
        float area = 3.14f *rad*rad;
        System.out.println(area);
    }
}
