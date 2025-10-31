class bitIsPower2{
    public static boolean is2(int n){
        return (n&(n-1)) ==0;
    }
    public static void main(String[] args) {
        System.out.print(is2(32));
    }
}