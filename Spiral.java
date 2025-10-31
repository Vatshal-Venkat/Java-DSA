//Spiral Matrix  to print a spiral in array
public class Spiral {
    public static void spiro(int mx[][]){
        int SR = 0;
        int SC = 0;
        int ER = mx.length-1;
        int EC = mx[0].length-1;

        while(SR <= ER && SC <= EC ){
            //top
            for (int j=SC ; j<=EC;j++){
                System.out.print(mx[SR][j]+" ");
            }
            //right
            for (int i=SR; i<=ER; i++){
                System.out.print(mx[i][EC]+" ");
            }
            //bottom
            for (int j=EC-1 ; j>= SC; j--){
                if (SC==EC){
                    break;
                }
                System.out.print(mx[ER][j]+" ");
            }
            //left
            for (int i=ER-1; i>=SR+1;i--){
                if (SR==ER){
                    break;
                }
                System.out.print(mx[i][SR]+" ");
            }
            SR++;
            SC++;
            EC--;
            ER--;
        }

    }
    
    public static void main(String args[]){
        int mx[][] = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};


        spiro(mx);
    }
}
