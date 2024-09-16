import java.util.*;
class BinaryTrees{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        //Binary Tree Traversal -->
        //1. preorder traversal-->
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        //2.Inorder Traversal -->
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        } 
        //3. postorder traversal -->
        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        //4. level Order traversal (BFS) -->
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
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
        //Qu : Count Nodes in tree -->
        public static int countNodes(Node root){
            if(root == null) return 0;
            int leftNodes = countNodes(root.left);
            int rightNodes = countNodes(root.right);
            return leftNodes + rightNodes + 1;
        }
        //sum of Nodes -->
        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            int sum = leftSum + rightSum + root.data;
            return sum;
        }
        //Height of Tree -->
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int h = Math.max(leftHeight,rightHeight) + 1;
            return h;
        }
        //Diameter of tree --> Number of nodes in the longest path between any 2 nodes
        //case1: diameter through root
        //case2 : diameter does not pass through root
        //Approach 1 --> timeComplexity : O(n^2)
        public static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right)+1;
            return Math.max(diam1 , Math.max(diam2,diam3));
        }
        //Approach 2 --> timeComplexity : O(n);
        static class TreeInfo{
            int ht;
            int diam;
            TreeInfo(int ht,int diam){
                this.ht = ht;
                this.diam = diam;
            }
        }
        public static TreeInfo diameter2(Node root){
            if(root == null){
                return new TreeInfo(0, 0);
            }
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);
            int myHeight = Math.max(left.ht , right.ht)+1;
            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;
            int myDiam = Math.max(diam1 , Math.max(diam2,diam3));
            TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
            return myInfo;
        }
        //subtree of another tree -->
        public static boolean isIdentical(Node root,Node subroot){
            if(root == null  && subroot == null) return true;
            if(root == null || subroot == null) return false;
            if(root.data == subroot.data){
                if(isIdentical(root, subroot)) return true;
            }
            return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
        }
        public static boolean isSubTree(Node root,Node subroot){
            if(subroot == null){
                return true;
            }
            if(root == null) return false;
            if(root.data == subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }
            return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
        }
    }

    public static void main(String args[]){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        // tree.levelOrder(root);
        // System.out.println(tree.countNodes(root));
        // System.out.println(tree.sumOfNodes(root));
        // System.out.println(tree.height(root));
        // System.out.println(tree.diameter(root));
        // System.out.println(tree.diameter2(root).diam);
    }
}