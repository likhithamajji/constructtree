class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
class constructtree{
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right=new Node(4);
        root.right.right=new Node(5);
        root.left.left=new Node(6);
        root.right.left=new Node(7);

    }
    

    }
