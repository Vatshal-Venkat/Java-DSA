import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={10,114,9,8,745,64,30};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search: ");
        int n = sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if (arr[i] == n){
                System.out.println(n+" is found at index: "+i);
            }
        }
    
    }
}
