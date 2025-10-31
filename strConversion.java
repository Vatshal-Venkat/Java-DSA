public class strConversion {
    public static String conversion(String str){
        StringBuilder ss = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        ss.append(ch);

        for (int i=1;i<str.length();i++){
            if (str.charAt(i)== ' ' && i<str.length()-1){
                ss.append(str.charAt(i));
                i++;
                ss.append(Character.toUpperCase(str.charAt(i)));

            }else{
                ss.append(str.charAt(i));
            }
        }
    return ss.toString();
    }
    
    public static void main(String[] args) {
        String str = "Hi, my name is venkat Vatshal. 22911A3529";
        System.out.println(conversion(str));
    }
}
