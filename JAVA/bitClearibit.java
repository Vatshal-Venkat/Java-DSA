public class bitClearibit {
    public static int Clear(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(Clear(15, 3));
    }
}
