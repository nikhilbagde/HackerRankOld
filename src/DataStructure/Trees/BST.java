package DataStructure.Trees;

/**
 * Created by Nikhil on 9/14/2016.
 */
public class BST {
    Node root;

    BST(){
        root = null;
    }
    BST(int data){
        root.data = data;
        root.left = root.right = root.parent = null;
    }

    //TO get Top view
    // https://www.hackerrank.com/challenges/tree-top-view
    void goLeft(Node node){
        if(node.left != null){
            goLeft(node.left);
        }
        System.out.print(node.data + " ");
    }
    void goRight(Node node){
        System.out.print(node.data + " ");
        if(node.right != null){
            goRight(node.right);
        }
    }
    void top_view(Node root){
        if(root.left != null){
            goLeft(root.left);
        }
        System.out.print(root.data + " ");

        if(root.right != null){
            goRight(root.right);
        }
    }

    //https://www.hackerrank.com/challenges/tree-preorder-traversal
    void preOrder(Node root) {
        System.out.print(root.data + " ");
        if(root.left!=null){
            preOrder(root.left);
        }
        if(root.right!=null){
            preOrder(root.right);
        }
    }

    //https://www.hackerrank.com/challenges/tree-postorder-traversal/submissions/code/27943957
    void postOrder(Node root) {
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

   //https://www.hackerrank.com/challenges/tree-inorder-traversal
    void inOrder(Node root) {
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }

    //https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree
    int height(Node root){
        if(root == null){
            return -1;
        }else{
            //int leftH = height(root.left);
            //int rightH = height(root.right);
            //System.out.print(leftH + "\n" + rightH);
            return 1 + Math.max(height(root.left), height(root.right));
        }

    }

}
