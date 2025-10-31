public class RecFriend {
    public static void main(String args[]){
        System.out.println(friendpair(3));
    }
    public static int friendpair(int n){
        if (n==1 || n==2){
            return n;
        }
        int fnm1 = friendpair(n-1);

        int fnm2 = friendpair(n-2);
        int pairways = (n-1) * fnm2;
        int totalWays = fnm1 * pairways;
    return totalWays;
    }
}
