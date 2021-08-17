public class BinaryTreePreOrder {

    private Node root;
    private class Node
    {
        private int data;
        private Node left;
        private Node right;

        public Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void createTree()
    {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        root = first;
        first.left = second;
        first.right = third;
        second.left = forth;
        second.right = fifth;
        third.left = sixth;
    }

    public void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args)
    {
        BinaryTreePreOrder btpo = new BinaryTreePreOrder();
        btpo.createTree();
        btpo.preOrder(btpo.root);
    }

}
