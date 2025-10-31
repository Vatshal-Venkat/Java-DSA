public class InsertionSort {
    public static void sort(int num[]){
        for (int i=1; i<num.length; i++){
            int now = num[i];
            int pre = i-1;
            while (pre >=0 && num[pre] > now){
                num[pre+1] = num[pre];
                pre--;
            }
            num[pre+1] = now;
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
