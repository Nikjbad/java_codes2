import java.util.LinkedList;
import java.util.Queue;


public class tree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        static class binaryTree {
            static int idx = -1;
            public static Node buildTree(int nodes[]) {
                idx++;
                if (nodes[idx] == -1) {
                    return null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
                return newNode;

            }
        
    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
        public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        
        postorder(root.left);
    
        postorder(root.right);
        
        System.out.print(root.data+ " ");
    }
    public static void levelorder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
               System.out.println();
               if(q.isEmpty()) {
                break;
               } else {
                q.add(null);
               }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left!= null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }

            }
        }
    }
    public static int countofNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNode = countofNodes(root.left);
        int rightNode = countofNodes(root.right);
        return leftNode + rightNode + 1;
    }

    public static int sumofNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNode = sumofNodes(root.left);
        int rightNode = sumofNodes(root.right);
        return leftNode + rightNode + root.data;
    }

     public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNode = height(root.left);
        int rightNode = height(root.right);
        return Math.max(leftNode, rightNode) + 1;
    }
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) + 1;
        return Math.max(dia3, Math.max(dia1, dia2));
    }
   static class treeinfo {
    int ht;
    int diam;

        public treeinfo( int ht, int diam) {
            this.ht = ht;
            this.diam = diam;

        }
        public static treeinfo diameter2(Node root) {
            if (root == null) {
                return new treeinfo(0,0);
            }
            treeinfo left = diameter2(root.left);
            treeinfo right = diameter2(root.right);
            int myheight = Math.max(left.ht, right.ht) + 1;
            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht +1;
            int mydiam = Math.max(Math.max(diam1, diam2), diam3);
            treeinfo info = new treeinfo(myheight, mydiam);
            return info;

        }
    
   }
    public static void main(String[] args) {
        
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        System.out.println();
        levelorder(root);
        System.out.println();
        System.out.println("count of nodes = "+countofNodes(root));
        System.out.println();
        System.out.println("sum of nodes = "+sumofNodes(root));
        System.out.println();
        System.out.println("max height of nodes = "+height(root));
        System.out.println();
        System.out.println("diameter of nodes = "+diameter(root));
         System.out.println();
        System.out.println("diameter2 of nodes = "+treeinfo.diameter2(root).diam);
    }
    
}
