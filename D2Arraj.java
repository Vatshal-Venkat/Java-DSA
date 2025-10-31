import java.util.*;
public class D2Arraj {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.println("Enter ["+i+","+j+"]:");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
