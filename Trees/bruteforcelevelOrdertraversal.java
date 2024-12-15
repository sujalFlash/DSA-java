//Brute force approch for level order traversal 
 class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value,TreeNode left,TreeNode right){
        this.value=value;
        this.left=left;
        this.right=right;
        
    }
}
class Main{
    public  static   TreeNode createTree(){
        TreeNode root=new TreeNode(10,null,null);
        TreeNode node1=new TreeNode(20,null,null);
        TreeNode node2=new TreeNode(30,null,null);
        TreeNode node3=new TreeNode(8,null,null);
        TreeNode node4=new TreeNode(7,null,null);
        TreeNode node5=new TreeNode(6,null,null);
        TreeNode node6=new TreeNode(9,null,null);
        TreeNode node7=new TreeNode(15,null,null);
        root.left=node1;
        root.right=node2;
        node1.left=node3;
        node1.right=node4;
        node2.right=node5;
        node4.left=node6;
        node4.right=node7;
        return root;
    }
    public static int height(TreeNode root){
        if(root==null)
             return -1;
        return 1+Math.max(height(root.left),height(root.right));
        
    }
    public static void printKdistance(TreeNode node,int k){
        if(node==null)
            return;
        if(k==0)
                System.out.print(node.value+" ");
        else{
            printKdistance(node.left,k-1);
            printKdistance(node.right,k-1); 
            }
    }
    public static void main(String[] args){
          TreeNode root=createTree();
          int h=height(root);
         System.out.println("The height of the binary tree is "+h);
         for(int i=0;i<=h;i++){
             printKdistance(root,i);
         }
    }
}
