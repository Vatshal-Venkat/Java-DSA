public class TrapWater {
    public static int water(int hgt[]){
       int n = hgt.length;
       int leftmax[] = new int[n];
       leftmax[0]= hgt[0];
       for (int i=1;i<n;i++){
        leftmax[i] = Math.max(hgt[i], leftmax[i-1]);
       }


       int[] rightmax = new int[n];
       rightmax[n-1] = hgt[n-1];
       for (int i = n-2; i>=0;i--){
         rightmax[i] = Math.max(hgt[i] , rightmax[i+1]);
       }

       int trap = 0;
       for (int i = 0; i<n; i++){
         int waterlevel = Math.min(leftmax[i], rightmax[i]);

         trap += waterlevel - hgt[i];
       }
       return trap;
    }
    public static void main(String[] args) {
        int hgt[] = {4,2,0,6,3,2,5};
        System.out.println("TrappedWater is "+water(hgt));
    }
}
