public class SelectionSort {
    public static void sort(int num[]){
        for (int i=0; i< num.length - 1;i++){
            int minp = i;
            for (int j=i+1; j<num.length ; j++){
                if (num[minp] < num[j]){
                    minp = j;
                }
            }
            int temp = num[minp];
            num[minp] = num[i];
            num[i] = temp;
        }
    }
    public static void Print(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num[] = {4, 2, 1, 5, 3};
        sort(num);
        Print(num);
    }
}
