
public static void B2D(int n){
    int pow=0;
    int decNum = 0;

    while(n>0){
        int last = n%10;
        decNum = decNum + (last *(int)Math.pow(2, pow));
        pow ++;

        n=n/10;
    }
    System.out.println("The Binary conversion of "+n+" is: "+decNum);




    public static void main(String[] args) {
        B2D(1001);
    }
} 

