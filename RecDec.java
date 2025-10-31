public class RecDec {
    public static void main(String[] args){
        int n = 10;
        //printDec(n);
        printInc(1);
    }
    public static void printDec(int n){
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if (n==15){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printInc(n+1);

    }
}
