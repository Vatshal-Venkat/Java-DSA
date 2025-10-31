public class BST{
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int key){
        if(root == null){
            root = new Node(key); return root;
        }

        if (root.data > key){
            root.left = insert(root.left, key);
        }else{
            root.right = insert(root.right, key);
        }




        return root;
    }

    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data == key) return true;
        if(root.data > key){
            return search(root.left,key);
        }
        return search(root.right,key);
    }

    public static void main(String[] args) {
        int values[] = {5,4,6,19,8,2,1,3};
        Node root = null;
        for (int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();
        System.out.println(search(root, 19));
    }
}