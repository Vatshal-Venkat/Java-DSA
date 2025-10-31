


public class strEquals {
    public static void main(String[] args) {
        String S1 = "Peter Parker";
        String S2 = "Peter Parker";
        String S3 = new String("Peter Parker");

        if(S1.equals(S3)){
         System.out.println("true");
        }
        else{
         System.out.println("false");
        }
        System.out.println(S1.equals(S2) + " " + S1.equals(S3));
    }
}
    
//== compares the object data, will be false when used with new keyword. So we have to use .equals!
    /*if (S1==S3){
     * sopl("YES");
     * else{
     * sopl("NO");
     * }
     * Answer will be NO
    } */