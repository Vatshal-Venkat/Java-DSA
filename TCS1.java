import java.util.Scanner;

public class TCS1 {
    public static void main(String args[]){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Lower linit");
        int l1 = sc.nextInt();
        System.out.println("UL:");
        int l2 = sc.nextInt();
        System.out.println(getAvg(l1,l2,arr));

    }

    public static int getAvg(int l1, int l2,int[] arr){
        int sum =0;
        int count =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > l1 && arr[i]<l2){
                sum = sum + arr[i];
                count++;
            }
        }
        int avg = sum/count;
        return avg;
    }
}
