
import java.util.HashSet;

public class HashingPQ3 {

    public static int  intersect(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            for (int j=0; j<arr2.length;j++){
                if (arr1[i] == arr2[j]){
                    set.add(arr1[i]);
                }
            }
        }

        System.out.println(set);

        return set.size();
    }
    public static void main(String args[]){
        int arr1[] = {13,21,57,29};
        int arr2[] = {21,10,1,2005,13};
        System.out.println(intersect(arr1, arr2));
    }
}
