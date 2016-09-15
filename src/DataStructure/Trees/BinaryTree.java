package DataStructure.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Nikhil on 9/14/2016.
 */
public class BinaryTree {
    private Node root;

    BinaryTree(){
        root = null;
    }
    BinaryTree(int data){
        root.data = data;
        root.left = root.right = root.parent = null;
    }

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

    //https://www.hackerrank.com/challenges/tree-level-order-traversal
       /*

    class Node
       int data;
       Node left;
       Node right;
   */
    void LevelOrder(Node root)
    {
       /*printLevelorder(tree)
    1) Create an empty queue q
    2) temp_node = root //start from root
        3) Loop while temp_node is not NULL
        a) print temp_node->data.
        b) Enqueue temp_node’s children (first left then right children) to q
        c) Dequeue a node from q and assign it’s value to temp_node
    */
       //We can use array implementation of queue too, here I have used linked list.
        //Its easy b/c I don't have to specify length as in case of array

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()){
            // Poll() is used for remove element from queue.
            // Read your java collection framework notes for detail.
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if(tempNode.left != null){
                queue.add(tempNode.left);
            }
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
        }

    }


}
