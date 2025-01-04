/*
recursive depth first search-inorder,preorder,postorder traversal of the binary tree
*/
class Node{
    Node lptr;
    Node rptr;
    int info;
    public Node(int info){
        this.info=info;
    }
}
public class Main{
     static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.info+" ");
        preorder(root.lptr);
        preorder(root.rptr);
    }
     static void inorder(Node root){
        if(root==null) return;
        inorder(root.lptr);
        System.out.print(root.info+" ");
        inorder(root.rptr);
    }
     static void postorder(Node root){
        if(root==null) return;
        postorder(root.lptr);
        postorder(root.rptr);
        System.out.print(root.info+" ");
    }
    public static void main(String[] args){
        //creating a binary tree
        Node node1=new Node(5);
        Node node2=new Node(6);
        Node node3=new Node(7);
        Node node4=new Node(8);
        Node node5=new Node(9);
        Node node6=new Node(10);
        node1.lptr=node3;
        node1.rptr=node4;
        node4.lptr=node5;
        node4.rptr=node6;
        node6.lptr=node2;
        System.out.println("Starting preorder traversal ");
        preorder(node1);
        System.out.println("Starting inorder traversal ");
        inorder(node1);
        System.out.println("Starting postorder traversal ");
        postorder(node1);
        
    }
}
