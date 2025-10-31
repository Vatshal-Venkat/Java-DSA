


public class RecSort {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        System.out.println(Check(num, 0));
    }
    public static boolean Check(int[] num, int i){
        if (i==num.length-1){
            return true;
        }
        if (num[i]>num[i+1]){
            return false;
        }
    return Check(num, i+1);
        
    }
}
