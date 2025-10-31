public class Largest {
    public static int getL(int num[]){
        int large = Integer.MIN_VALUE;
        for (int i=0;i<num.length;i++){
            if (large < num[i]){
                large = num[i];
            }
        }
    return large;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,24,17};
        System.out.println("Largest Number is: "+getL(num));
    }
}
