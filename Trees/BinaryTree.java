class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class Main{
  public static void preOrder(Node newNode){
    if(newNode == null){
      return ;
    }
    System.out.print(newNode.data+" ");
    preOrder(newNode.left);
    preOrder(newNode.right);
  
  }
    public static Node build(int[] arr,int start,int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start)/2;
        Node root = new Node(arr[mid]);
        
            root.left = build(arr,start,mid-1);
            root.right = build(arr,mid+1,end);
         
        return root;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7};
        int start = 0;
        int end = arr.length-1;
       Node newNode = build(arr,start,end);
       preOrder(newNode);
       
    }
}