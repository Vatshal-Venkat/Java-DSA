public class trieUniqueSub {

    static class Node{
        Node[] children;
        boolean eow;

        Node(){
            this.children = new Node[26];
            for (int i=0;i<26;i++){
                this.children[i] = null;
            }
            this.eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String str){
        Node curr = root;
        for (int i=0;i<str.length();i++){
            int idx = str.charAt(i) - 'a';
            if (curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if (i == str.length()-1){
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for (int i = 0;i<key.length();i++){
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null)return false;
            if (i == key.length()-1 && curr.children[idx].eow == false) return false;

        }
        return true;
    }

    public static void unique(String str){
        for (int i=0; i<str.length();i++){
            System.out.println(str.substring(i));
        }
    }

    public static int count (Node root){
        int count = 0;
        if (root == null){
            return 0;
        }
        for (int i=0; i<26;i++){
            if(root.children[i] != null){
                count =count + count(root.children[i]);
            }
        }
        return count + 1;
    }
    public static void main(String[] args){
        String str = "ababa";
        insert(str);
        unique(str);
        String key = "abb";
        search(key);
        System.out.println("Total Nodes: "+count(root));
    }
}
