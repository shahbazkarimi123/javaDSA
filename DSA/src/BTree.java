class Node
{
    int data;
    Node left;
    Node right;

}

class BST
{
    public Node createNewNode(int val)
    {
        Node a = new Node();
        a.data = val;
        a.left = null;
        a.right = null;
        return a;
    }
    public Node insert(Node node, int val)
    {
        if(node == null)
        {
            return createNewNode(val);
        }
        if(val<node.data)
        {
            node.left = insert(node.left, val);
        }
        else if(val>node.data)
        {
            node.right = insert(node.right, val);
        }
        return node;
    }

    public void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void postOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}

public class BTree {
    public static void main(String[] args)
    {
        BST a = new BST();
        Node root = null;
        root = a.insert(root,6);
        root = a.insert(root,9);
        root = a.insert(root, 5);
        root = a.insert(root, 8);
        root = a.insert(root, 7);
        root = a.insert(root, 4);
        System.out.println("Pre Order.");
        a.preOrder(root);
        System.out.println("\nIn Order");
        a.inOrder(root);
        System.out.println("\nPost Order");
        a.postOrder(root);

    }

}
