import java.util.Arrays;
public class InbuiltSort {
    public static void main(String[] args) {
        int num[] = {4,2,1,3,5};
        Arrays.sort(num);
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }
}

//if we import util.Collections and use Arrays.sort(arr,si,ei, Collections.reverseOrder())
//We get it in descending Order but inplace of 'int' we've to take 'Integer'