class Node{
    public int data;
    public Node left;
    public Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    public Node root=null;
    void insert(int data){
        Node newnode=new Node(data);
        if(root==null){
            root=newnode;
        }
        else{
            Node temp=root;
            while(true){
                if(temp.data>data){
                    if(temp.left==null){
                        temp.left=newnode;
                        break;
                    }
                    else{
                        temp=temp.left;
                    }
                }
                else{
                    if(temp.right==null){
                        temp.right=newnode;
                        break;
                    }
                    else{
                        temp=temp.right;
                    }
                }
            }
        }
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Tree t=new Tree();
		t.insert('d');
		t.insert('s');
		t.insert('f');
		t.insert('r');
		t.insert('a');
		t.insert('0');
		t.insert('w');
		t.insert('i');
		t.insert('l');
		t.insert('z');
		System.out.println("INORDER");
		t.inorder(t.root);
		System.out.println("\nPREORDER");
		t.preorder(t.root);
		System.out.println("\nPOSTORDER");
		t.postorder(t.root);
	}
}
