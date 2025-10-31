public class SortHW {
    public static void bub(int num[]){
        for (int i=0;i<num.length-1;i++){
            for (int j=0;j<num.length-1-i;j++){
                if (num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num [j + 1] = temp;
                }
            }
            
        }
    }
    public static void sel(int num[]){
        for (int i=0;i<num.length-1;i++){
            int minp =num[i];
            for (int j=i+1;j<num.length;j++){
                if (num[j] < minp){
                    minp = num[j];
                }
            }
            int temp = minp;
            minp = num[i];
            num[i] = temp;
        }
        
    }
    public static void insert(int num[]){
        
        for (int i=0; i<num.length-1;i++){
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
        int num[] ={ 3,6,2,1,8,7,4,5,3,1};
        bub(num);
        Print(num);
        sel(num);
        Print(num);
        insert(num);
        Print(num);
    }
}
