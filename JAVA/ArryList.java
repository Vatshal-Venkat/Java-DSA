import java.util.ArrayList;
import java.util.Collections;
public class ArryList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(14);
        list.add(97);
        /*System.out.println(list);
        int ele = list.get(2);
        System.out.println("Index 2: "+ele);
        list.remove(1);
        System.out.println(list);
        //add ele in between;
        list.add(1,16);
        System.out.println(list);

        //Set element
        list.set(1,48);
        System.out.println(list);

        //size
        int len = list.size();
        System.out.println(len);*/

        for (int i = 4; i<10;i++){
            list.add(i);
        }

        for (int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        Collections.sort(list);
        System.out.print(list+" ");
    }
}
