import java.util.*;
public class Arrayo {
    public static int repo(int x, int y, int z){
        int a = (int)(((x + y + z) / 3));
        System.out.print("Average: "+a);
        if (a>46){
            System.out.println("YOU'VE PASSED! CONGRAGULATIONS.");
        }else{
            System.out.println("Hardluck, Better luck next time");
        }
        return a;
    }
    public static void main(String[] args) {
        int marks[]= new int[8];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics Marks: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Chemistry Marks: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Mathematics Marks: ");
        marks[2] = sc.nextInt();
        


        System.out.println("*************************************");
        
        
        System.out.println("Your Marks are");
        System.out.println("PHYSICS: "+marks[0]);
        System.out.println("CHEMISTRY: "+marks[1]);
        System.out.println("MATHEMATICS: "+marks[2]);

        System.out.println("*************************************");

        repo(marks[0], marks[1], marks[2]);
    }
}
