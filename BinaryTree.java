import java.util.LinkedList;
import java.util.Queue;
public class BinaryTree {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTreeOperations {
        static int idx = -1;
        public static Node build(int nodes[]){
            idx++;
            if(nodes[idx] == -1) {
                return null;
            } 

            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);


            return newNode;
        }
    }

    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null) return;
        
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root){
        if(root == null) return;
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);

                }
                if(currNode.right != null){
                    q.add(currNode.right);

                }
            }

        }
    }

    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftnodes = countOfNodes(root.left);
        int rightnodes = countOfNodes(root.right);

        return leftnodes + rightnodes + 1;
    }


    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);

        return leftsum + rightsum + root.data;
    }

    public static int maxDepth(Node root){
        if(root == null) return 0;
        int leftheight = maxDepth(root.left);
        int rightheight = maxDepth(root.right);

        int myHeight = Math.max(leftheight,rightheight) + 1;
        int x = leftheight + rightheight + root.data;
        return myHeight;
    }

    //Diameter of a tree is the number of nodes in the longest path between two nodes
    public static int Diameter(Node root){
        if(root == null) return 0;
        int dia1 = Diameter(root.left);
        int dia2 = Diameter(root.right);
        int dia3 = maxDepth(root.left) + maxDepth(root.right) + 1;
        return Math.max(dia1, Math.max(dia2, dia3));
        //O(N^2)
    }

    //let us write a method of TC O(N) which returns both height and diameter at once

    public static class TreeInfo{
        int ht;
        int dia;

        public TreeInfo(int ht, int dia) {
            this.ht = ht;
            this.dia = dia;
        }

        
    }

    public static TreeInfo dia2(Node root){
        if(root == null) return new TreeInfo(0,0);

        TreeInfo left = dia2(root.left);
        TreeInfo right = dia2(root.right);
        int myheight = Math.max(right.ht, left.ht) + 1;

        int di1 = left.dia;
        int di2 = right.dia;
        int di3 = left.ht + right.ht + 1;

        int mydia = Math.max(di1,Math.max(di2,di3));

        TreeInfo t = new TreeInfo(myheight, mydia);

        return t;
    }

    //SubTree (*****) to chech whether a given sub tree is a part of the main tree

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }
        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
        
        public static boolean Identical(TreeNode root, TreeNode subRoot){
            if (root==null && subRoot == null) return true;
            if (root== null || subRoot == null) return false;

            return Identical(root.left, subRoot.left) && Identical(root.right, subRoot.right);
        }

        public static boolean isSubTree(TreeNode root, TreeNode subRoot){
            if(root == null) return false;
            if(subRoot == null) return true;

            if (root.val == subRoot.val && Identical(root, subRoot)){
                return true;
            }

            if (root.val == subRoot.val) {
                return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
            }

            return false;
        }
    }

    public static Node delete(Node root, int val){
        if(root.data > val ){
            root.left = delete(root.left, val);
        }else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }

            Node InS = inorderSucces(root.right);
            root.data = InS.data;
            root.right = delete(root.right, InS.data);
        }
        return root;
    }

    public static Node inorderSucces(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }




    //to print a number between ranges of x & y in a BST
    public static void inRange(Node root, int x, int y){

        if (root.data >= x && root.data <= y){
            inRange(root.left, x, y);
            System.out.print(root.data + " ");
            inRange(root.right, x, y);
        }
        
        else if(x>=root.data){
            inRange(root.right, x, y);
        }else if (y<=root.data){
            inRange(root.left, x, y);
        }else if(root == null){
            return;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeOperations tree = new BinaryTreeOperations();
        Node root = tree.build(nodes);
        /*preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(maxDepth(root));
        System.out.println(Diameter(root));
        System.out.println(dia2(root).dia);
       // System.out.println(isSubTree(1,3));*/
       inOrder(root);
       delete(root, 4);
       inOrder(root);
       //inRange(root, 3, 15);
       
    }
}
