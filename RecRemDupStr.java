public class RecRemDupStr {
    public static void main(String[] args) {
        String Str = "venkatvatshalisspiderman";
        remove(Str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void remove(String Str, int i, StringBuilder newStr, boolean[] map){
        if(i==Str.length()){
            System.out.println(newStr);
            return;
        }

        char current = Str.charAt(i);
        if (map[current-'a']==true){
            remove(Str, i+1, newStr, map);
        }
        else{
            map[current-'a']=true;
            remove(Str, i+1, newStr.append(current), map);

        }
    }
}
