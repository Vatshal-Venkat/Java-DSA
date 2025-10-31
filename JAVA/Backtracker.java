


public class Backtracker {
    public static void main(String[] args){
        String str = "ABC";
        printChoice(str, 0, "");
    }
    public static void printChoice(String str, int idx, String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        
        for (int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String news = str.substring(0,i) + str.substring(i+1);
            printChoice(news, idx+1, perm+curr);
        }
    }
}
