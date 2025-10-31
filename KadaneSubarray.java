public class KadaneSubarray {
    public static void Kadanes(int num[]){
        int ms= Integer.MIN_VALUE;
        int cs = 0;

        for (int i=0;i<num.length;i++){
            cs = cs+ num[i];
            if (cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subarray sum is: "+ms);
    }
    public static void main(String[] args) {
        int num[] = {-2,-3,4,1,-3,5};
        Kadanes(num);
    }
}
