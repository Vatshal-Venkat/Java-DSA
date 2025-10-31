public class repeat2 {
    public static boolean isrepeating(int dent[]){
        for (int i=0;i<dent.length;i++){
            for (int j=i+1;j<dent.length;j++){
                if (dent[i]==dent[j]){
                    return true;
                }
            }
        }
    return false;
    }
    public static void main(String[] args) {
        int dent[] = {1,2,3,4};
        System.out.println(isrepeating(dent));
    }
}
