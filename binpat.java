public class binpat {
    public static void binary(int r, int c){
        for (int i=1;i<=r;i++){
            for (int j=1; j<=i;j++){
                if((i+j)==2 || (i+j)==4 || (i+j)==6 || (i+j)==8 || (i+j)==10){
                    System.out.print('1');
                }else{
                    System.out.print('0');

                }
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        binary(5,5);
    }
}
