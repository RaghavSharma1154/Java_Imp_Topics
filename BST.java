import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        //Time Complexity : O(n)
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data < val){
            root.right = insert(root.right, val);
        }if(root.data > val){
            root.left = insert(root.left,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    // Searching in a BST --> Time Complexity : O(log n)
    public static boolean search(Node root,int key){
        if(root == null) return false;
        if(root.data > key){
            return search(root.left,key);
        }
        else if(root.data < key){
            return search(root.right,key);
        }else{
            return true;
        }
    }
    //Delete a Node in BST -->
    //case1 : Leaf Node : delete and return null to parent
    //case2 : one child : Delete node and replace with child node
    //case3 : 2 children : replace value with inorder successor ,delete the node for inorder successor
    //Inorder successor --> Left most in right subtree  , it has always 0 or 1 child
    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left,val);
        }else if(root.data < val){
            root.right = delete(root.right,val);
        }
        else{//root.data == val
            //case 1: 
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2: 
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            //case 3 :
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }
    //Inorder successor -->
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    //Qu :Print in range -->
    public static void printInRange(Node root,int X,int Y){
        if(root == null) return;
        if(root.data >= X && root.data <= Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);
        }
        else if(root.data >= Y){
            printInRange(root.left, X, Y);
        }else{
            printInRange(root.right, X, Y);
        }
    }
    //Qu : find paths to leaf node -->
    public static void printRoot2Leaf(Node root,ArrayList<Integer> paths){
        if(root == null){
            return;
        }
        paths.add(root.data);
        if(root.left == null && root.right == null){
            printPath(paths);
        }
        else{
            printRoot2Leaf(root.left, paths);
            printRoot2Leaf(root.right, paths);
        }
        paths.remove(paths.size()-1);
    }
    public static void printPath(ArrayList<Integer> paths){
        for(int i=0;i<paths.size();i++){
            System.out.print(paths.get(i) + "-->");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i = 0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        // System.out.println(search(root, 1));
        // delete(root, 2);
        // printInRange(root, 2, 5);
        printRoot2Leaf(root,new ArrayList<>());
    }
}
