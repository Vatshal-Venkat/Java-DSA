import java.util.Scanner;

public class TCS4 {

    public static int oddsum(int[] arr){
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]%2 != 0){
                sum = sum + arr[i];
            }
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(oddsum(arr));
    }
}
