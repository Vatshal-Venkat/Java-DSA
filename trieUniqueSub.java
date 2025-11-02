public class trieUniqueSub {

    public static void unique(String str){
        for (int i=0; i<str.length();i++){
            System.out.println(str.substring(i));
        }
    }
    public static void main(String[] args){
        String str = "ababa";
        unique(str);
    }
}
