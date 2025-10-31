public class DCQuickSort {
    public static void main(String[] args) {
        int[] arr = {6,3,9,8,2,5};
        quicker(arr,0,arr.length-1);
        printi(arr);
    }
    public static void quicker(int[] arr,int si, int ei){
        if (si>= ei){
            return;
        }
        int pIdx = partition(arr,si,ei);
        quicker(arr, si, pIdx-1);
        quicker(arr, pIdx+1, ei);
        
    
    }
    public static int partition(int arr[],int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
    return i;
    }
    public static void printi(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}



/*int[] temp = new int[arr.length];
        int mid = temp.length/2;
        temp[mid] = pivot;
        int k=arr[0]-1;
        for (int i=0; i<arr.length;i++){
            
            if(arr[i]<=temp[mid]){
                
                i++;
                
                 
            }
            else{
                temp[0] = arr[i];
                i++;k++;
            }
        }*/