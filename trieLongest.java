public class trieLongest {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for (int i=0;i<26;i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String words){
        Node curr = root;
        for (int i = 0; i< words.length();i++){
            int idx = words.charAt(i) - 'a';
            if (curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if (i == words.length() - 1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }       
    }


    public static boolean search(String key){
        Node curr = root;
        for (int i=0; i<key.length();i++){
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null){
                return false;
            }

            if (i==key.length()-1 && curr.children[idx].eow == false){
                return false;
            }
        }
        return true;
    }


    public static String ans = "";
    public static void Longest(Node root, StringBuilder temp){
        for (int i = 0; i<26;i++){
            if (root.children[i]!= null && root.children[i].eow == true){
                temp.append((char)(i+'a'));

                if (temp.length() >= ans.length()){
                    ans = temp.toString();
                }

                Longest(root.children[i], temp);

                temp.deleteCharAt(temp.length()-1);
            }
        }
        
    }


    public static void main(String args[]){
        String[] words = {"a","ap","app","appl","apply","apple","application","applicant","banana","ophiocordyceps"};
        for (int i=0;i<words.length;i++){
            insert(words[i]);
        }
        Longest(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
