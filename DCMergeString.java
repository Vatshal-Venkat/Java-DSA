import java.util.Arrays;

public class DCMergeString {
    public static void main(String[] args) {
        String[] arr = {"sun","earth","mars","mercury"}; 
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(String arr[],int si,int ei){
        if (si>ei){
            return;
        }

    }
    public static void merge(int arr[],int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i =si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
                
            }else{
                temp[k++] = arr[j++];
                
            }
            
        }

        //left
        while(i <=mid){
            temp[k++] = arr[i++];
        }

        //right
        while(j<= ei){
            temp[k++] = arr[j++];
        }

        for (k=0, i=si; k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void printArr(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

    

