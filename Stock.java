public class Stock {
    public static int  stake(int price[]){
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i=0; i<price.length;i++){
            if (buy < price[i]){
                int profit = price[i] - buy;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buy = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(stake(price));
    }
}
